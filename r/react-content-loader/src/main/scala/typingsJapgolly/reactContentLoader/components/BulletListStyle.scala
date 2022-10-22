package typingsJapgolly.reactContentLoader.components

import typingsJapgolly.reactContentLoader.mod.IContentLoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BulletListStyle {
  
  @JSImport("react-content-loader/dist/web/presets/BulletListStyle", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: BulletListStyle.type): SharedBuilder_IContentLoaderProps732959227 = new SharedBuilder_IContentLoaderProps732959227(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IContentLoaderProps): SharedBuilder_IContentLoaderProps732959227 = new SharedBuilder_IContentLoaderProps732959227(js.Array(this.component, p.asInstanceOf[js.Any]))
}
