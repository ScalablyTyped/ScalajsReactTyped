package typingsJapgolly.knockoutPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.knockoutPaging.KnockoutComputedFunctions because Already inherited */ @js.native
trait KnockoutComputed[T] extends KnockoutObservable[T] {
  var fn: KnockoutComputedFunctions[_] = js.native
  def dispose(): Unit = js.native
  def getDependenciesCount(): Double = js.native
  def isActive(): Boolean = js.native
}

