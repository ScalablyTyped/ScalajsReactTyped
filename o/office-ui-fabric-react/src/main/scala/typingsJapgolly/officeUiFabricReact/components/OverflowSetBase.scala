package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiReactFocus.libComponentsFocusZoneFocusZoneDottypesMod.IFocusZoneProps
import typingsJapgolly.officeUiFabricReact.libComponentsOverflowSetOverflowSetDottypesMod.IOverflowSet
import typingsJapgolly.officeUiFabricReact.libComponentsOverflowSetOverflowSetDottypesMod.IOverflowSetItemProps
import typingsJapgolly.officeUiFabricReact.libComponentsOverflowSetOverflowSetDottypesMod.IOverflowSetProps
import typingsJapgolly.officeUiFabricReact.libComponentsOverflowSetOverflowSetDottypesMod.IOverflowSetStyles
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.end
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.start
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OverflowSetBase {
  
  inline def apply(
    onRenderItem: IOverflowSetItemProps => Any,
    onRenderOverflowButton: (/* props */ js.UndefOr[js.Array[Any]], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[js.Array[Any]], Element | Null]]) => Element | Null
  ): Builder = {
    val __props = js.Dynamic.literal(onRenderItem = js.Any.fromFunction1(onRenderItem), onRenderOverflowButton = js.Any.fromFunction2(onRenderOverflowButton))
    new Builder(js.Array(this.component, __props.asInstanceOf[IOverflowSetProps]))
  }
  
  @JSImport("office-ui-fabric-react", "OverflowSetBase")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.officeUiFabricReact.mod.OverflowSetBase] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IOverflowSet]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IOverflowSet | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IOverflowSet | Null) => value(t0).runNow()))
    
    inline def doNotContainWithinFocusZone(value: Boolean): this.type = set("doNotContainWithinFocusZone", value.asInstanceOf[js.Any])
    
    inline def focusZoneProps(value: IFocusZoneProps): this.type = set("focusZoneProps", value.asInstanceOf[js.Any])
    
    inline def itemSubMenuProvider(value: /* item */ IOverflowSetItemProps => js.UndefOr[js.Array[Any] | Boolean]): this.type = set("itemSubMenuProvider", js.Any.fromFunction1(value))
    
    inline def items(value: js.Array[IOverflowSetItemProps]): this.type = set("items", value.asInstanceOf[js.Any])
    
    inline def itemsVarargs(value: IOverflowSetItemProps*): this.type = set("items", js.Array(value*))
    
    inline def keytipSequences(value: js.Array[String]): this.type = set("keytipSequences", value.asInstanceOf[js.Any])
    
    inline def keytipSequencesVarargs(value: String*): this.type = set("keytipSequences", js.Array(value*))
    
    inline def overflowItems(value: js.Array[IOverflowSetItemProps]): this.type = set("overflowItems", value.asInstanceOf[js.Any])
    
    inline def overflowItemsVarargs(value: IOverflowSetItemProps*): this.type = set("overflowItems", js.Array(value*))
    
    inline def overflowSide(value: start | end): this.type = set("overflowSide", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[IOverflowSetProps, IOverflowSetStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IOverflowSetProps => DeepPartial[IOverflowSetStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IOverflowSetProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
