package typingsJapgolly.sugar.sugarjs.Array

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.sugar.sugarjs.SugarNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends SugarNamespace
     with Instantiable0[Chainable[js.Object, typingsJapgolly.sugar.Array[js.Object]]]
     with Instantiable1[
      (/* obj */ ArrayLike[js.Object]) | (/* obj */ Double), 
      Chainable[js.Object, typingsJapgolly.sugar.Array[js.Object]]
    ]
     with Instantiable2[
      (/* obj */ ArrayLike[js.Object]) | (/* obj */ Double), 
      /* clone */ Boolean, 
      Chainable[js.Object, typingsJapgolly.sugar.Array[js.Object]]
    ] {
  def apply[T](): Chainable[T, typingsJapgolly.sugar.Array[T]] = js.native
  def apply[T](obj: Double): Chainable[T, typingsJapgolly.sugar.Array[T]] = js.native
  def apply[T](obj: Double, clone: Boolean): Chainable[T, typingsJapgolly.sugar.Array[T]] = js.native
  def apply[T](obj: ArrayLike[T]): Chainable[T, typingsJapgolly.sugar.Array[T]] = js.native
  def apply[T](obj: ArrayLike[T], clone: Boolean): Chainable[T, typingsJapgolly.sugar.Array[T]] = js.native
  def add[T](instance: typingsJapgolly.sugar.Array[T], item: T): typingsJapgolly.sugar.Array[T] = js.native
  def add[T](instance: typingsJapgolly.sugar.Array[T], item: T, index: Double): typingsJapgolly.sugar.Array[T] = js.native
  def add[T](instance: typingsJapgolly.sugar.Array[T], item: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
  def add[T](instance: typingsJapgolly.sugar.Array[T], item: typingsJapgolly.sugar.Array[T], index: Double): typingsJapgolly.sugar.Array[T] = js.native
  def append[T](instance: typingsJapgolly.sugar.Array[T], item: T): typingsJapgolly.sugar.Array[T] = js.native
  def append[T](instance: typingsJapgolly.sugar.Array[T], item: T, index: Double): typingsJapgolly.sugar.Array[T] = js.native
  def append[T](instance: typingsJapgolly.sugar.Array[T], item: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
  def append[T](instance: typingsJapgolly.sugar.Array[T], item: typingsJapgolly.sugar.Array[T], index: Double): typingsJapgolly.sugar.Array[T] = js.native
  def at[T](instance: typingsJapgolly.sugar.Array[T], index: Double): T = js.native
  def at[T](instance: typingsJapgolly.sugar.Array[T], index: Double, loop: Boolean): T = js.native
  def at[T](instance: typingsJapgolly.sugar.Array[T], index: typingsJapgolly.sugar.Array[Double]): T = js.native
  def at[T](
    instance: typingsJapgolly.sugar.Array[T],
    index: typingsJapgolly.sugar.Array[Double],
    loop: Boolean
  ): T = js.native
  def average[T, U](instance: typingsJapgolly.sugar.Array[T]): Double = js.native
  def average[T, U](instance: typingsJapgolly.sugar.Array[T], map: String): Double = js.native
  def average[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U]): Double = js.native
  def clone[T](instance: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
  def compact[T](instance: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
  def compact[T](instance: typingsJapgolly.sugar.Array[T], all: Boolean): typingsJapgolly.sugar.Array[T] = js.native
  def construct[T](n: Double, indexMapFn: js.Function1[/* i */ Double, T]): typingsJapgolly.sugar.Array[T] = js.native
  def count[T](instance: typingsJapgolly.sugar.Array[T], search: T): Double = js.native
  def count[T](instance: typingsJapgolly.sugar.Array[T], search: T, context: js.Any): Double = js.native
  def count[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T]): Double = js.native
  def count[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T], context: js.Any): Double = js.native
  def create[T](): typingsJapgolly.sugar.Array[T] = js.native
  def create[T](obj: Double): typingsJapgolly.sugar.Array[T] = js.native
  def create[T](obj: Double, clone: Boolean): typingsJapgolly.sugar.Array[T] = js.native
  def create[T](obj: ArrayLike[T]): typingsJapgolly.sugar.Array[T] = js.native
  def create[T](obj: ArrayLike[T], clone: Boolean): typingsJapgolly.sugar.Array[T] = js.native
  def every[T](instance: typingsJapgolly.sugar.Array[T], search: T): Boolean = js.native
  def every[T](instance: typingsJapgolly.sugar.Array[T], search: T, context: js.Any): Boolean = js.native
  def every[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T]): Boolean = js.native
  def every[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T], context: js.Any): Boolean = js.native
  def everyFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double): T = js.native
  def everyFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def everyFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def exclude[T](instance: typingsJapgolly.sugar.Array[T], search: T): typingsJapgolly.sugar.Array[T] = js.native
  def exclude[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T]): typingsJapgolly.sugar.Array[T] = js.native
  def filter[T](instance: typingsJapgolly.sugar.Array[T], search: T): typingsJapgolly.sugar.Array[T] = js.native
  def filter[T](instance: typingsJapgolly.sugar.Array[T], search: T, context: js.Any): typingsJapgolly.sugar.Array[T] = js.native
  def filter[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T]): typingsJapgolly.sugar.Array[T] = js.native
  def filter[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T], context: js.Any): typingsJapgolly.sugar.Array[T] = js.native
  def filterFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double): T = js.native
  def filterFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def filterFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def find[T](instance: typingsJapgolly.sugar.Array[T], search: T): T = js.native
  def find[T](instance: typingsJapgolly.sugar.Array[T], search: T, context: js.Any): T = js.native
  def find[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T]): T = js.native
  def find[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T], context: js.Any): T = js.native
  def findFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double): T = js.native
  def findFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def findFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def findIndex[T](instance: typingsJapgolly.sugar.Array[T], search: T): Double = js.native
  def findIndex[T](instance: typingsJapgolly.sugar.Array[T], search: T, context: js.Any): Double = js.native
  def findIndex[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T]): Double = js.native
  def findIndex[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T], context: js.Any): Double = js.native
  def findIndexFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double): T = js.native
  def findIndexFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def findIndexFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def first[T](instance: typingsJapgolly.sugar.Array[T]): T = js.native
  def first[T](instance: typingsJapgolly.sugar.Array[T], num: Double): T = js.native
  def flatten[T](instance: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
  def flatten[T](instance: typingsJapgolly.sugar.Array[T], limit: Double): typingsJapgolly.sugar.Array[T] = js.native
  def forEachFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double): T = js.native
  def forEachFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def forEachFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def from[T](instance: typingsJapgolly.sugar.Array[T], index: Double): typingsJapgolly.sugar.Array[T] = js.native
  def getOption[T](name: String): T = js.native
  def groupBy[T, U](instance: typingsJapgolly.sugar.Array[T], map: String): js.Object = js.native
  def groupBy[T, U](
    instance: typingsJapgolly.sugar.Array[T],
    map: String,
    groupFn: js.Function3[/* arr */ typingsJapgolly.sugar.Array[T], /* key */ String, /* obj */ js.Object, Unit]
  ): js.Object = js.native
  def groupBy[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U]): js.Object = js.native
  def groupBy[T, U](
    instance: typingsJapgolly.sugar.Array[T],
    map: mapFn[T, U],
    groupFn: js.Function3[/* arr */ typingsJapgolly.sugar.Array[T], /* key */ String, /* obj */ js.Object, Unit]
  ): js.Object = js.native
  def inGroups[T](instance: typingsJapgolly.sugar.Array[T], num: Double): typingsJapgolly.sugar.Array[T] = js.native
  def inGroups[T](instance: typingsJapgolly.sugar.Array[T], num: Double, padding: js.Any): typingsJapgolly.sugar.Array[T] = js.native
  def inGroupsOf[T](instance: typingsJapgolly.sugar.Array[T], num: Double): typingsJapgolly.sugar.Array[T] = js.native
  def inGroupsOf[T](instance: typingsJapgolly.sugar.Array[T], num: Double, padding: js.Any): typingsJapgolly.sugar.Array[T] = js.native
  def insert[T](instance: typingsJapgolly.sugar.Array[T], item: T): typingsJapgolly.sugar.Array[T] = js.native
  def insert[T](instance: typingsJapgolly.sugar.Array[T], item: T, index: Double): typingsJapgolly.sugar.Array[T] = js.native
  def insert[T](instance: typingsJapgolly.sugar.Array[T], item: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
  def insert[T](instance: typingsJapgolly.sugar.Array[T], item: typingsJapgolly.sugar.Array[T], index: Double): typingsJapgolly.sugar.Array[T] = js.native
  def intersect[T](instance: typingsJapgolly.sugar.Array[T], arr: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
  def isEmpty[T](instance: typingsJapgolly.sugar.Array[T]): Boolean = js.native
  def isEqual[T](instance: typingsJapgolly.sugar.Array[T], arr: typingsJapgolly.sugar.Array[T]): Boolean = js.native
  def last[T](instance: typingsJapgolly.sugar.Array[T]): T = js.native
  def last[T](instance: typingsJapgolly.sugar.Array[T], num: Double): T = js.native
  def least[T, U](instance: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
  def least[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean): typingsJapgolly.sugar.Array[T] = js.native
  def least[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean, map: String): typingsJapgolly.sugar.Array[T] = js.native
  def least[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean, map: mapFn[T, U]): typingsJapgolly.sugar.Array[T] = js.native
  def least[T, U](instance: typingsJapgolly.sugar.Array[T], map: String): typingsJapgolly.sugar.Array[T] = js.native
  def least[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U]): typingsJapgolly.sugar.Array[T] = js.native
  def map[T, U](instance: typingsJapgolly.sugar.Array[T], map: String): typingsJapgolly.sugar.Array[U] = js.native
  def map[T, U](instance: typingsJapgolly.sugar.Array[T], map: String, context: js.Any): typingsJapgolly.sugar.Array[U] = js.native
  def map[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U]): typingsJapgolly.sugar.Array[U] = js.native
  def map[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U], context: js.Any): typingsJapgolly.sugar.Array[U] = js.native
  def mapFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double): T = js.native
  def mapFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def mapFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def max[T, U](instance: typingsJapgolly.sugar.Array[T]): T = js.native
  def max[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean): T = js.native
  def max[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean, map: String): T = js.native
  def max[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean, map: mapFn[T, U]): T = js.native
  def max[T, U](instance: typingsJapgolly.sugar.Array[T], map: String): T = js.native
  def max[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U]): T = js.native
  def median[T, U](instance: typingsJapgolly.sugar.Array[T]): Double = js.native
  def median[T, U](instance: typingsJapgolly.sugar.Array[T], map: String): Double = js.native
  def median[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U]): Double = js.native
  def min[T, U](instance: typingsJapgolly.sugar.Array[T]): T = js.native
  def min[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean): T = js.native
  def min[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean, map: String): T = js.native
  def min[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean, map: mapFn[T, U]): T = js.native
  def min[T, U](instance: typingsJapgolly.sugar.Array[T], map: String): T = js.native
  def min[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U]): T = js.native
  def most[T, U](instance: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
  def most[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean): typingsJapgolly.sugar.Array[T] = js.native
  def most[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean, map: String): typingsJapgolly.sugar.Array[T] = js.native
  def most[T, U](instance: typingsJapgolly.sugar.Array[T], all: Boolean, map: mapFn[T, U]): typingsJapgolly.sugar.Array[T] = js.native
  def most[T, U](instance: typingsJapgolly.sugar.Array[T], map: String): typingsJapgolly.sugar.Array[T] = js.native
  def most[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U]): typingsJapgolly.sugar.Array[T] = js.native
  def none[T](instance: typingsJapgolly.sugar.Array[T], search: T): Boolean = js.native
  def none[T](instance: typingsJapgolly.sugar.Array[T], search: T, context: js.Any): Boolean = js.native
  def none[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T]): Boolean = js.native
  def none[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T], context: js.Any): Boolean = js.native
  def reduceFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double): T = js.native
  def reduceFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def reduceFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def reduceRightFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double): T = js.native
  def reduceRightFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def reduceRightFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def remove[T](instance: typingsJapgolly.sugar.Array[T], search: T): typingsJapgolly.sugar.Array[T] = js.native
  def remove[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T]): typingsJapgolly.sugar.Array[T] = js.native
  def removeAt[T](instance: typingsJapgolly.sugar.Array[T], start: Double): typingsJapgolly.sugar.Array[T] = js.native
  def removeAt[T](instance: typingsJapgolly.sugar.Array[T], start: Double, end: Double): typingsJapgolly.sugar.Array[T] = js.native
  def sample[T](instance: typingsJapgolly.sugar.Array[T]): T = js.native
  def sample[T](instance: typingsJapgolly.sugar.Array[T], num: Double): T = js.native
  def sample[T](instance: typingsJapgolly.sugar.Array[T], num: Double, remove: Boolean): T = js.native
  def setOption(name: String, value: js.Any): Unit = js.native
  def setOption(options: ArrayOptions): Unit = js.native
  def shuffle[T](instance: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
  def some[T](instance: typingsJapgolly.sugar.Array[T], search: T): Boolean = js.native
  def some[T](instance: typingsJapgolly.sugar.Array[T], search: T, context: js.Any): Boolean = js.native
  def some[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T]): Boolean = js.native
  def some[T](instance: typingsJapgolly.sugar.Array[T], search: searchFn[T], context: js.Any): Boolean = js.native
  def someFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double): T = js.native
  def someFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def someFromIndex[T](instance: typingsJapgolly.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def sortBy[T, U](instance: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
  def sortBy[T, U](instance: typingsJapgolly.sugar.Array[T], map: String): typingsJapgolly.sugar.Array[T] = js.native
  def sortBy[T, U](instance: typingsJapgolly.sugar.Array[T], map: String, desc: Boolean): typingsJapgolly.sugar.Array[T] = js.native
  def sortBy[T, U](instance: typingsJapgolly.sugar.Array[T], map: sortMapFn[T, U]): typingsJapgolly.sugar.Array[T] = js.native
  def sortBy[T, U](instance: typingsJapgolly.sugar.Array[T], map: sortMapFn[T, U], desc: Boolean): typingsJapgolly.sugar.Array[T] = js.native
  def subtract[T](instance: typingsJapgolly.sugar.Array[T], item: T): typingsJapgolly.sugar.Array[T] = js.native
  def subtract[T](instance: typingsJapgolly.sugar.Array[T], item: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
  def sum[T, U](instance: typingsJapgolly.sugar.Array[T]): Double = js.native
  def sum[T, U](instance: typingsJapgolly.sugar.Array[T], map: String): Double = js.native
  def sum[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U]): Double = js.native
  def to[T](instance: typingsJapgolly.sugar.Array[T], index: Double): typingsJapgolly.sugar.Array[T] = js.native
  def union[T](instance: typingsJapgolly.sugar.Array[T], arr: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
  def unique[T, U](instance: typingsJapgolly.sugar.Array[T]): typingsJapgolly.sugar.Array[T] = js.native
  def unique[T, U](instance: typingsJapgolly.sugar.Array[T], map: String): typingsJapgolly.sugar.Array[T] = js.native
  def unique[T, U](instance: typingsJapgolly.sugar.Array[T], map: mapFn[T, U]): typingsJapgolly.sugar.Array[T] = js.native
  def zip[T](instance: typingsJapgolly.sugar.Array[T], args: js.Any*): typingsJapgolly.sugar.Array[T] = js.native
}

