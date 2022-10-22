package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsProgressIndicatorProgressIndicatorDottypesMod.IProgressIndicatorProps
import typingsJapgolly.officeUiFabricReact.libComponentsProgressIndicatorProgressIndicatorDottypesMod.IProgressIndicatorStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsProgressIndicatorProgressIndicatorDottypesMod.IProgressIndicatorStyles
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ProgressIndicatorBase {
  
  @JSImport("office-ui-fabric-react", "ProgressIndicatorBase")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.officeUiFabricReact.mod.ProgressIndicatorBase] {
    
    inline def ariaValueText(value: String): this.type = set("ariaValueText", value.asInstanceOf[js.Any])
    
    inline def barHeight(value: Double): this.type = set("barHeight", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def description(value: VdomNode): this.type = set("description", value.rawNode.asInstanceOf[js.Any])
    
    inline def descriptionNull: this.type = set("description", null)
    
    inline def descriptionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("description", js.Array(value*))
    
    inline def descriptionVdomElement(value: VdomElement): this.type = set("description", value.rawElement.asInstanceOf[js.Any])
    
    inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def onRenderProgress(
      value: (/* props */ js.UndefOr[IProgressIndicatorProps], /* defaultRender */ js.UndefOr[
          js.Function1[
            /* props */ js.UndefOr[IProgressIndicatorProps], 
            typingsJapgolly.react.mod.global.JSX.Element | Null
          ]
        ]) => typingsJapgolly.react.mod.global.JSX.Element | Null
    ): this.type = set("onRenderProgress", js.Any.fromFunction2(value))
    
    inline def percentComplete(value: Double): this.type = set("percentComplete", value.asInstanceOf[js.Any])
    
    inline def progressHidden(value: Boolean): this.type = set("progressHidden", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[IProgressIndicatorStyleProps, IProgressIndicatorStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IProgressIndicatorStyleProps => DeepPartial[IProgressIndicatorStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ProgressIndicatorBase.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IProgressIndicatorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
