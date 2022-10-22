package typingsJapgolly.grommet.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.grommet.anon.Format
import typingsJapgolly.grommet.es6ComponentsGrommetMod.GrommetExtendedProps
import typingsJapgolly.grommet.es6ThemesBaseMod.ThemeType
import typingsJapgolly.grommet.es6UtilsMod.BackgroundType
import typingsJapgolly.grommet.grommetStrings.dark
import typingsJapgolly.grommet.grommetStrings.light
import typingsJapgolly.grommet.grommetStrings.min
import typingsJapgolly.grommet.grommetStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Grommet {
  
  @JSImport("grommet/es6", "Grommet_")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def background(value: BackgroundType): this.type = set("background", value.asInstanceOf[js.Any])
    
    inline def containerTarget(value: HTMLElement): this.type = set("containerTarget", value.asInstanceOf[js.Any])
    
    inline def cssVars(value: Boolean): this.type = set("cssVars", value.asInstanceOf[js.Any])
    
    inline def dir(value: rtl): this.type = set("dir", value.asInstanceOf[js.Any])
    
    inline def full(value: Boolean | min): this.type = set("full", value.asInstanceOf[js.Any])
    
    inline def messages(value: Format): this.type = set("messages", value.asInstanceOf[js.Any])
    
    inline def onAnalytics(value: /* data */ Any => Callback): this.type = set("onAnalytics", js.Any.fromFunction1((t0: /* data */ Any) => value(t0).runNow()))
    
    inline def options(value: typingsJapgolly.grommet.anon.Layer): this.type = set("options", value.asInstanceOf[js.Any])
    
    inline def plain(value: Boolean): this.type = set("plain", value.asInstanceOf[js.Any])
    
    inline def theme(value: ThemeType): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def themeMode(value: dark | light): this.type = set("themeMode", value.asInstanceOf[js.Any])
    
    inline def userAgent(value: String): this.type = set("userAgent", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Grommet.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GrommetExtendedProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
