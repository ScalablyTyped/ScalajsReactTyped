package typingsJapgolly.grommet.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.anon.Items
import typingsJapgolly.grommet.anon.PauseButton
import typingsJapgolly.grommet.es6ComponentsVideoMod.VideoExtendedProps
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.grommetBooleans.`false`
import typingsJapgolly.grommet.grommetStrings.below
import typingsJapgolly.grommet.grommetStrings.contain
import typingsJapgolly.grommet.grommetStrings.cover
import typingsJapgolly.grommet.grommetStrings.over
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Video {
  
  @JSImport("grommet/es6", "Video")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def a11yTitle(value: A11yTitleType): this.type = set("a11yTitle", value.asInstanceOf[js.Any])
    
    inline def alignSelf(value: AlignSelfType): this.type = set("alignSelf", value.asInstanceOf[js.Any])
    
    inline def autoPlay(value: Boolean): this.type = set("autoPlay", value.asInstanceOf[js.Any])
    
    inline def controls(value: `false` | over | below | Items): this.type = set("controls", value.asInstanceOf[js.Any])
    
    inline def fit(value: cover | contain): this.type = set("fit", value.asInstanceOf[js.Any])
    
    inline def gridArea(value: GridAreaType): this.type = set("gridArea", value.asInstanceOf[js.Any])
    
    inline def loop(value: Boolean): this.type = set("loop", value.asInstanceOf[js.Any])
    
    inline def margin(value: MarginType): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def messages(value: PauseButton): this.type = set("messages", value.asInstanceOf[js.Any])
    
    inline def mute(value: Boolean): this.type = set("mute", value.asInstanceOf[js.Any])
    
    inline def skipInterval(value: Double): this.type = set("skipInterval", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Video.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VideoExtendedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
