package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fluentuiTheme.libTypesIthemeMod.ITheme
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardImageDottypesMod.IDocumentCardImage
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardImageDottypesMod.IDocumentCardImageProps
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardImageDottypesMod.IDocumentCardImageStyleProps
import typingsJapgolly.officeUiFabricReact.libComponentsDocumentCardDocumentCardImageDottypesMod.IDocumentCardImageStyles
import typingsJapgolly.officeUiFabricReact.libComponentsIconIconDottypesMod.IIconProps
import typingsJapgolly.officeUiFabricReact.libComponentsImageImageDottypesMod.ImageFit
import typingsJapgolly.uifabricMergeStyles.libDeepPartialMod.DeepPartial
import typingsJapgolly.uifabricMergeStyles.libIstylefunctionMod.IStyleFunctionOrObject
import typingsJapgolly.uifabricUtilities.libCreateRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DocumentCardImage {
  
  @JSImport("office-ui-fabric-react", "DocumentCardImage")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def componentRef(value: IRefObject[IDocumentCardImage]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    inline def componentRefFunction1(value: /* ref */ IDocumentCardImage | Null => Callback): this.type = set("componentRef", js.Any.fromFunction1((t0: /* ref */ IDocumentCardImage | Null) => value(t0).runNow()))
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def iconProps(value: IIconProps): this.type = set("iconProps", value.asInstanceOf[js.Any])
    
    inline def imageFit(value: ImageFit): this.type = set("imageFit", value.asInstanceOf[js.Any])
    
    inline def imageSrc(value: String): this.type = set("imageSrc", value.asInstanceOf[js.Any])
    
    inline def styles(value: IStyleFunctionOrObject[IDocumentCardImageStyleProps, IDocumentCardImageStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    
    inline def stylesFunction1(value: IDocumentCardImageStyleProps => DeepPartial[IDocumentCardImageStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    
    inline def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DocumentCardImage.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDocumentCardImageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
