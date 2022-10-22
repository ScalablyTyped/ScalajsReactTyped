package typingsJapgolly.materializeCss.global.M

import org.scalajs.dom.Element
import typingsJapgolly.materializeCss.M.ScrollSpyOptions
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.anon.PartialScrollSpyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("M.ScrollSpy")
@js.native
open class ScrollSpy ()
  extends StObject
     with typingsJapgolly.materializeCss.M.Component[ScrollSpyOptions] {
  
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
  var options: ScrollSpyOptions = js.native
}
object ScrollSpy {
  
  @JSGlobal("M.ScrollSpy")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typingsJapgolly.materializeCss.M.ScrollSpy = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materializeCss.M.ScrollSpy]
  
  /**
    * Init ScrollSpy
    */
  /* static member */
  inline def init(els: Element): typingsJapgolly.materializeCss.M.ScrollSpy = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materializeCss.M.ScrollSpy]
  inline def init(els: Element, options: PartialScrollSpyOptions): typingsJapgolly.materializeCss.M.ScrollSpy = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.materializeCss.M.ScrollSpy]
  /**
    * Init ScrollSpies
    */
  /* static member */
  inline def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.ScrollSpy] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.materializeCss.M.ScrollSpy]]
  inline def init(els: MElements, options: PartialScrollSpyOptions): js.Array[typingsJapgolly.materializeCss.M.ScrollSpy] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.materializeCss.M.ScrollSpy]]
}
