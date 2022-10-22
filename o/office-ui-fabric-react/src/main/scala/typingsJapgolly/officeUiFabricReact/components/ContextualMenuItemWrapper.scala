package typingsJapgolly.officeUiFabricReact.components

import typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuDotclassNamesMod.IMenuItemClassNames
import typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuDottypesMod.IContextualMenuItem
import typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuItemWrapperContextualMenuItemWrapperDottypesMod.IContextualMenuItemWrapperProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ContextualMenuItemWrapper {
  
  inline def apply(
    classNames: IMenuItemClassNames,
    focusableElementIndex: Double,
    index: Double,
    item: IContextualMenuItem,
    totalItemCount: Double
  ): SharedBuilder_IContextualMenuItemWrapperProps_1138345542[
    typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuItemWrapperMod.ContextualMenuItemWrapper
  ] = {
    val __props = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], focusableElementIndex = focusableElementIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any])
    new SharedBuilder_IContextualMenuItemWrapperProps_1138345542[
    typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuItemWrapperMod.ContextualMenuItemWrapper
  ](js.Array(this.component, __props.asInstanceOf[IContextualMenuItemWrapperProps]))
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ContextualMenu/ContextualMenuItemWrapper", "ContextualMenuItemWrapper")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IContextualMenuItemWrapperProps): SharedBuilder_IContextualMenuItemWrapperProps_1138345542[
    typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuItemWrapperMod.ContextualMenuItemWrapper
  ] = new SharedBuilder_IContextualMenuItemWrapperProps_1138345542[
    typingsJapgolly.officeUiFabricReact.libComponentsContextualMenuContextualMenuItemWrapperMod.ContextualMenuItemWrapper
  ](js.Array(this.component, p.asInstanceOf[js.Any]))
}
