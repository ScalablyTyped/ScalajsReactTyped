package typingsJapgolly.filestackReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.filestackReact.mod.PickerBaseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PickerDropPane {
  
  inline def apply(apikey: String): Builder = {
    val __props = js.Dynamic.literal(apikey = apikey.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PickerBaseProps]))
  }
  
  @JSImport("filestack-react", "PickerDropPane")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def clientOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ClientOptions */ Any
    ): this.type = set("clientOptions", value.asInstanceOf[js.Any])
    
    inline def onError(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerFileMetadata */ /* error */ Any => Callback
    ): this.type = set("onError", js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerFileMetadata */ /* error */ Any) => value(t0).runNow()))
    
    inline def onSuccess(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerFileMetadata */ /* result */ Any => Callback
    ): this.type = set("onSuccess", js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerFileMetadata */ /* result */ Any) => value(t0).runNow()))
    
    inline def onUploadDone(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerFileMetadata */ /* result */ Any => Callback
    ): this.type = set("onUploadDone", js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerFileMetadata */ /* result */ Any) => value(t0).runNow()))
    
    inline def pickerOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PickerOptions */ Any
    ): this.type = set("pickerOptions", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PickerBaseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
