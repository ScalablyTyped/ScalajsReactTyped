package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IDetailsListStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod.IDetailsListStyles
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListDetailsRowDottypesMod.IDetailsRowProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListShimmeredDetailsListDottypesMod.IShimmeredDetailsListProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListShimmeredDetailsListDottypesMod.IShimmeredDetailsListStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDetailsListShimmeredDetailsListDottypesMod.IShimmeredDetailsListStyles
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShimmeredDetailsListBase {
  
  @JSImport("office-ui-fabric-react", "ShimmeredDetailsListBase")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.officeUiFabricReact.mod.ShimmeredDetailsListBase] {
    
    inline def ariaLabelForShimmer(value: String): this.type = set("ariaLabelForShimmer", value.asInstanceOf[js.Any])
    
    inline def detailsListStyles(value: IStyleFunctionOrObject[IDetailsListStyleProps, IDetailsListStyles]): this.type = set("detailsListStyles", value.asInstanceOf[js.Any])
    
    inline def detailsListStylesFunction1(value: IDetailsListStyleProps => DeepPartial[IDetailsListStyles]): this.type = set("detailsListStyles", js.Any.fromFunction1(value))
    
    inline def enableShimmer(value: Boolean): this.type = set("enableShimmer", value.asInstanceOf[js.Any])
    
    inline def onRenderCustomPlaceholder(
      value: (/* rowProps */ IDetailsRowProps, /* index */ js.UndefOr[Double], /* defaultRender */ js.UndefOr[js.Function1[/* props */ IDetailsRowProps, Node]]) => Node
    ): this.type = set("onRenderCustomPlaceholder", js.Any.fromFunction3(value))
    
    inline def removeFadingOverlay(value: Boolean): this.type = set("removeFadingOverlay", value.asInstanceOf[js.Any])
    
    inline def shimmerLines(value: Double): this.type = set("shimmerLines", value.asInstanceOf[js.Any])
    
    inline def shimmerOverlayStyles(value: IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles]): this.type = set("shimmerOverlayStyles", value.asInstanceOf[js.Any])
    
    inline def shimmerOverlayStylesFunction1(value: IShimmeredDetailsListStyleProps => DeepPartial[IShimmeredDetailsListStyles]): this.type = set("shimmerOverlayStyles", js.Any.fromFunction1(value))
    
    inline def styles(value: IStyleFunctionOrObject[IShimmeredDetailsListStyleProps, IShimmeredDetailsListStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IShimmeredDetailsListStyleProps => DeepPartial[IShimmeredDetailsListStyles]): this.type = set("styles", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: ShimmeredDetailsListBase.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IShimmeredDetailsListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
