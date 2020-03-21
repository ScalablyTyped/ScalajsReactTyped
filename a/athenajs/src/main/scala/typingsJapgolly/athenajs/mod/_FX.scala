package typingsJapgolly.athenajs.mod

import typingsJapgolly.athenajs.Anon0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("athenajs", "_FX")
@js.native
/**
  * Creates the FX class, adding the linear easing
  */
class _FX () extends js.Object {
  /**
    * Add a new easing function for other objects to use
    *
    */
  def addEasing(
    easingName: String,
    easingFn: js.Function5[
      /* x */ js.UndefOr[Double], 
      /* t */ js.UndefOr[Double], 
      /* b */ js.UndefOr[Double], 
      /* c */ js.UndefOr[Double], 
      /* d */ js.UndefOr[Double], 
      Unit
    ]
  ): Unit = js.native
  /**
    * Add a new Effect
    */
  def addFX(fxName: String, FxClass: Anon0): Unit = js.native
  /**
    * Retrieves an easing function
    *
    */
  def getEasing(easingName: String): js.Function5[
    /* x */ js.UndefOr[Double], 
    /* t */ js.UndefOr[Double], 
    /* b */ js.UndefOr[Double], 
    /* c */ js.UndefOr[Double], 
    /* d */ js.UndefOr[Double], 
    Unit
  ] = js.native
  /**
    * Retrieve an effect Class by its name
    *
    */
  def getEffect(fxName: String): Effect = js.native
}

