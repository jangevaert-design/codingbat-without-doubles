public class withoutDoubles {
  public int withoutDoubles(int die1, int die2, boolean noDoubles) {

    if (noDoubles && die1 == 6 && die2 == 6) {
      return 7;
    } else if (noDoubles && die1 == die2 && die1 == 6) {
      return (6 + (die2 + 1));
    } else if (noDoubles && die1 == die2 && die2 == 6) {
      return (6 + (die1 + 1));
    } else if (noDoubles && die1 == die2 && die1 != 6 && die2 != 6) {
      return (die1 + (die2 + 1));
    } else {
      return die1 + die2;
    }
  }

/* more concise
public int withoutDoubles(int die1, int die2, boolean noDoubles) {
if (noDoubles) {
  if (die1 == die2) {
    if (die1 != 6) {
      return (die1 + die2 + 1);
    } else {
      return (die2 + 1);
    }
  }
  }
  return (die1 + die2);

}
*/
}
