package typingsJapgolly.leaflet.global.L

import typingsJapgolly.leaflet.mod.BaseIconOptions
import typingsJapgolly.leaflet.mod.Icon_.DefaultIconOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("L.Icon")
@js.native
open class Icon_[T /* <: BaseIconOptions */] protected ()
  extends typingsJapgolly.leaflet.mod.Icon_[T] {
  def this(options: T) = this()
}
object Icon_ {
  
  @JSGlobal("L.Icon.Default")
  @js.native
  open class Default ()
    extends typingsJapgolly.leaflet.mod.Icon_.Default {
    def this(options: DefaultIconOptions) = this()
  }
  object Default {
    
    @JSGlobal("L.Icon.Default")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("L.Icon.Default.imagePath")
    @js.native
    def imagePath: js.UndefOr[String] = js.native
    inline def imagePath_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imagePath")(x.asInstanceOf[js.Any])
  }
}
