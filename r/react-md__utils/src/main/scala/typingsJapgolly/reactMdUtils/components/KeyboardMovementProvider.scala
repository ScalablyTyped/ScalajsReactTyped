package typingsJapgolly.reactMdUtils.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMdUtils.typesKeyboardMovementKeyboardMovementProviderMod.KeyboardMovementProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object KeyboardMovementProvider {
  
  @JSImport("@react-md/utils", "KeyboardMovementProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def decrementKeys(value: js.Array[String]): this.type = set("decrementKeys", value.asInstanceOf[js.Any])
    
    inline def decrementKeysVarargs(value: String*): this.type = set("decrementKeys", js.Array(value*))
    
    inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    inline def includeDisabled(value: Boolean): this.type = set("includeDisabled", value.asInstanceOf[js.Any])
    
    inline def incrementKeys(value: js.Array[String]): this.type = set("incrementKeys", value.asInstanceOf[js.Any])
    
    inline def incrementKeysVarargs(value: String*): this.type = set("incrementKeys", js.Array(value*))
    
    inline def jumpToFirstKeys(value: js.Array[String]): this.type = set("jumpToFirstKeys", value.asInstanceOf[js.Any])
    
    inline def jumpToFirstKeysVarargs(value: String*): this.type = set("jumpToFirstKeys", js.Array(value*))
    
    inline def jumpToLastKeys(value: js.Array[String]): this.type = set("jumpToLastKeys", value.asInstanceOf[js.Any])
    
    inline def jumpToLastKeysVarargs(value: String*): this.type = set("jumpToLastKeys", js.Array(value*))
    
    inline def loopable(value: Boolean): this.type = set("loopable", value.asInstanceOf[js.Any])
    
    inline def searchable(value: Boolean): this.type = set("searchable", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: KeyboardMovementProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: KeyboardMovementProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
