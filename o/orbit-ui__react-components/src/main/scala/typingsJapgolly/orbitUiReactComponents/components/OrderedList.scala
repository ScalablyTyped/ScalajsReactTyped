package typingsJapgolly.orbitUiReactComponents.components

import org.scalajs.dom.HTMLElement
import typingsJapgolly.orbitUiReactComponents.distListSrcListMod.InnerListProps
import typingsJapgolly.orbitUiReactComponents.distSharedSrcForwardRefMod.MergeWithAs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OrderedList {
  
  @JSImport("@orbit-ui/react-components", "OrderedList")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: OrderedList.type): SharedBuilder_MergeWithAs1391628631 = new SharedBuilder_MergeWithAs1391628631(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MergeWithAs[HTMLElement, InnerListProps]): SharedBuilder_MergeWithAs1391628631 = new SharedBuilder_MergeWithAs1391628631(js.Array(this.component, p.asInstanceOf[js.Any]))
}
