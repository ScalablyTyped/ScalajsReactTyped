package typingsJapgolly.wordpressEditor.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.wordpressBlockEditor.anon.Open
import typingsJapgolly.wordpressBlockEditor.componentsMediaUploadMod.MediaUpload.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MediaUpload {
  
  inline def apply[T /* <: Boolean */](
    onSelect: /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? std.Array<{  id :number, [k: string] : any}> : {  id :number, [k: string] : any} */ /* value */ js.Any => Callback,
    render: Open => Element
  ): Builder[T] = {
    val __props = js.Dynamic.literal(onSelect = js.Any.fromFunction1((t0: /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? std.Array<{  id :number, [k: string] : any}> : {  id :number, [k: string] : any} */ /* value */ js.Any) => onSelect(t0).runNow()), render = js.Any.fromFunction1(render))
    new Builder[T](js.Array(this.component, __props.asInstanceOf[Props[T]]))
  }
  
  @JSImport("@wordpress/editor", "MediaUpload_")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T /* <: Boolean */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def addToGallery(value: Boolean): this.type = set("addToGallery", value.asInstanceOf[js.Any])
    
    inline def allowedTypes(value: js.Array[String]): this.type = set("allowedTypes", value.asInstanceOf[js.Any])
    
    inline def allowedTypesVarargs(value: String*): this.type = set("allowedTypes", js.Array(value*))
    
    inline def gallery(value: Boolean): this.type = set("gallery", value.asInstanceOf[js.Any])
    
    inline def modalClass(value: String): this.type = set("modalClass", value.asInstanceOf[js.Any])
    
    inline def multiple(value: T): this.type = set("multiple", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def value(
      value: /* import warning: importer.ImportType#apply Failed type conversion: T extends true ? std.Array<number> : number | undefined */ js.Any
    ): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps[T /* <: Boolean */](p: Props[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
