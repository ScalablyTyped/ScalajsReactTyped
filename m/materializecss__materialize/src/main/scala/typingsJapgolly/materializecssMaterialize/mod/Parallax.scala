package typingsJapgolly.materializecssMaterialize.mod

import org.scalajs.dom.Element
import typingsJapgolly.materializecssMaterialize.M.ParallaxOptions
import typingsJapgolly.materializecssMaterialize.MElements
import typingsJapgolly.materializecssMaterialize.anon.PartialParallaxOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@materializecss/materialize", "Parallax")
@js.native
open class Parallax ()
  extends StObject
     with typingsJapgolly.materializecssMaterialize.M.Component[ParallaxOptions] {
  
  /**
    * Destroy plugin instance and teardown
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /**
    * The DOM element the plugin was initialized with
    */
  /* CompleteClass */
  var el: Element = js.native
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: ParallaxOptions = js.native
}
object Parallax {
  
  @JSImport("@materializecss/materialize", "Parallax")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typingsJapgolly.materializecssMaterialize.M.Parallax = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materializecssMaterialize.M.Parallax]
  
  /**
    * Init Parallax
    */
  /* static member */
  inline def init(els: Element): typingsJapgolly.materializecssMaterialize.M.Parallax = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materializecssMaterialize.M.Parallax]
  inline def init(els: Element, options: PartialParallaxOptions): typingsJapgolly.materializecssMaterialize.M.Parallax = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.materializecssMaterialize.M.Parallax]
  /**
    * Init Parallaxs
    */
  /* static member */
  inline def init(els: MElements): js.Array[typingsJapgolly.materializecssMaterialize.M.Parallax] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.materializecssMaterialize.M.Parallax]]
  inline def init(els: MElements, options: PartialParallaxOptions): js.Array[typingsJapgolly.materializecssMaterialize.M.Parallax] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.materializecssMaterialize.M.Parallax]]
}
