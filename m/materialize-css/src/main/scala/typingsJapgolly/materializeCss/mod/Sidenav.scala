package typingsJapgolly.materializeCss.mod

import org.scalajs.dom.Element
import typingsJapgolly.materializeCss.M.SidenavOptions
import typingsJapgolly.materializeCss.MElements
import typingsJapgolly.materializeCss.anon.PartialSidenavOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("materialize-css", "Sidenav")
@js.native
open class Sidenav ()
  extends StObject
     with typingsJapgolly.materializeCss.M.Sidenav {
  
  /* CompleteClass */
  override def close(): Unit = js.native
  
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
    * Describes if Sidenav is being dragged
    */
  /* CompleteClass */
  var isDragged: Boolean = js.native
  
  /**
    * Describes if sidenav is fixed
    */
  /* CompleteClass */
  var isFixed: Boolean = js.native
  
  /* CompleteClass */
  var isOpen: Boolean = js.native
  
  /* CompleteClass */
  override def open(): Unit = js.native
  
  /**
    * The options the instance was initialized with
    */
  /* CompleteClass */
  var options: SidenavOptions = js.native
}
object Sidenav {
  
  @JSImport("materialize-css", "Sidenav")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Get Instance
    */
  /* static member */
  inline def getInstance(elem: Element): typingsJapgolly.materializeCss.M.Sidenav = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(elem.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materializeCss.M.Sidenav]
  
  /**
    * Init Sidenav
    */
  /* static member */
  inline def init(els: Element): typingsJapgolly.materializeCss.M.Sidenav = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.materializeCss.M.Sidenav]
  inline def init(els: Element, options: PartialSidenavOptions): typingsJapgolly.materializeCss.M.Sidenav = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.materializeCss.M.Sidenav]
  /**
    * Init Sidenavs
    */
  /* static member */
  inline def init(els: MElements): js.Array[typingsJapgolly.materializeCss.M.Sidenav] = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any]).asInstanceOf[js.Array[typingsJapgolly.materializeCss.M.Sidenav]]
  inline def init(els: MElements, options: PartialSidenavOptions): js.Array[typingsJapgolly.materializeCss.M.Sidenav] = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(els.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.materializeCss.M.Sidenav]]
}
