package typingsJapgolly.nextAuth.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nextAuth.coreTypesMod.Session
import typingsJapgolly.nextAuth.reactTypesMod.SessionProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SessionProvider {
  
  @JSImport("next-auth/react", "SessionProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def basePath(value: String): this.type = set("basePath", value.asInstanceOf[js.Any])
    
    inline def baseUrl(value: String): this.type = set("baseUrl", value.asInstanceOf[js.Any])
    
    inline def refetchInterval(value: Double): this.type = set("refetchInterval", value.asInstanceOf[js.Any])
    
    inline def refetchOnWindowFocus(value: Boolean): this.type = set("refetchOnWindowFocus", value.asInstanceOf[js.Any])
    
    inline def session(value: Session): this.type = set("session", value.asInstanceOf[js.Any])
    
    inline def sessionNull: this.type = set("session", null)
  }
  
  implicit def make(companion: SessionProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SessionProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
