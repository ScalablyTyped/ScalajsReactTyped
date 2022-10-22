package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.officeUiFabricReact.libComponentsKeytipLayerKeytipLayerDottypesMod.IKeytipLayer
import typingsJapgolly.officeUiFabricReact.libComponentsKeytipLayerKeytipLayerDottypesMod.IKeytipLayerProps
import typingsJapgolly.officeUiFabricReact.libComponentsKeytipLayerKeytipLayerDottypesMod.IKeytipLayerStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsKeytipLayerKeytipLayerDottypesMod.IKeytipLayerStyles
import typingsJapgolly.officeUiFabricReact.libUtilitiesKeytipsIkeytiptransitionkeyMod.IKeytipTransitionKey
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KeytipLayer {
  
  inline def apply(content: String): Builder = {
    val __props = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IKeytipLayerProps]))
  }
  
  @JSImport("office-ui-fabric-react", "KeytipLayer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[IKeytipLayer] {
    
    inline def componentRef(value: IRefObject[IKeytipLayer]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IKeytipLayer | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IKeytipLayer | Null) => value(t0).runNow()))
    
    inline def keytipExitSequences(value: js.Array[IKeytipTransitionKey]): this.type = set("keytipExitSequences", value.asInstanceOf[js.Any])
    
    inline def keytipExitSequencesVarargs(value: IKeytipTransitionKey*): this.type = set("keytipExitSequences", js.Array(value*))
    
    inline def keytipReturnSequences(value: js.Array[IKeytipTransitionKey]): this.type = set("keytipReturnSequences", value.asInstanceOf[js.Any])
    
    inline def keytipReturnSequencesVarargs(value: IKeytipTransitionKey*): this.type = set("keytipReturnSequences", js.Array(value*))
    
    inline def keytipStartSequences(value: js.Array[IKeytipTransitionKey]): this.type = set("keytipStartSequences", value.asInstanceOf[js.Any])
    
    inline def keytipStartSequencesVarargs(value: IKeytipTransitionKey*): this.type = set("keytipStartSequences", js.Array(value*))
    
    inline def onEnterKeytipMode(value: Callback): this.type = set("onEnterKeytipMode", value.toJsFn)
    
    inline def onExitKeytipMode(
      value: /* ev */ js.UndefOr[ReactKeyboardEventFrom[HTMLElement] | ReactMouseEventFrom[HTMLElement]] => Callback
    ): this.type = set("onExitKeytipMode", js.Any.fromFunction1((t0: /* ev */ js.UndefOr[ReactKeyboardEventFrom[HTMLElement] | ReactMouseEventFrom[HTMLElement]]) => value(t0).runNow()))
    
    inline def styles(value: IStyleFunctionOrObject[IKeytipLayerStyleProps, IKeytipLayerStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IKeytipLayerStyleProps => DeepPartial[IKeytipLayerStyles]): this.type = set("styles", js.Any.fromFunction1(value))
  }
  
  def withProps(p: IKeytipLayerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
