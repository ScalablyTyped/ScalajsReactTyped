package typingsJapgolly.reactMdUtils.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactMdUtils.typesDirMod.DirProps
import typingsJapgolly.reactMdUtils.typesDirMod.WritingDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dir {
  
  @JSImport("@react-md/utils", "Dir")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def defaultDir(value: WritingDirection | js.Function0[WritingDirection]): this.type = set("defaultDir", value.asInstanceOf[js.Any])
    
    inline def defaultDirCallbackTo(value: CallbackTo[WritingDirection]): this.type = set("defaultDir", value.toJsFn)
  }
  
  implicit def make(companion: Dir.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DirProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
