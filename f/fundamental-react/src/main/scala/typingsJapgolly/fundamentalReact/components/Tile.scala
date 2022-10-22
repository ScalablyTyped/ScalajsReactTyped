package typingsJapgolly.fundamentalReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.fundamentalReact.fundamentalReactStrings.s
import typingsJapgolly.fundamentalReact.libTileTileMod.TileContentProps
import typingsJapgolly.fundamentalReact.libTileTileMod.TileFooterProps
import typingsJapgolly.fundamentalReact.libTileTileMod.TileHeaderProps
import typingsJapgolly.fundamentalReact.libTileTileMod.TileProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tile {
  
  object Content {
    
    @JSImport("fundamental-react", "Tile.Content")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def twoColumns(value: Boolean): this.type = set("twoColumns", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Content.type): typingsJapgolly.fundamentalReact.components.Tile.Content.Builder = new typingsJapgolly.fundamentalReact.components.Tile.Content.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TileContentProps): typingsJapgolly.fundamentalReact.components.Tile.Content.Builder = new typingsJapgolly.fundamentalReact.components.Tile.Content.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Footer {
    
    @JSImport("fundamental-react", "Tile.Footer")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Footer.type): typingsJapgolly.fundamentalReact.components.Tile.Footer.Builder = new typingsJapgolly.fundamentalReact.components.Tile.Footer.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TileFooterProps): typingsJapgolly.fundamentalReact.components.Tile.Footer.Builder = new typingsJapgolly.fundamentalReact.components.Tile.Footer.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Header {
    
    @JSImport("fundamental-react", "Tile.Header")
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[js.Object] {
      
      inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      
      inline def subtitle(value: String): this.type = set("subtitle", value.asInstanceOf[js.Any])
    }
    
    implicit def make(companion: Header.type): typingsJapgolly.fundamentalReact.components.Tile.Header.Builder = new typingsJapgolly.fundamentalReact.components.Tile.Header.Builder(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TileHeaderProps): typingsJapgolly.fundamentalReact.components.Tile.Header.Builder = new typingsJapgolly.fundamentalReact.components.Tile.Header.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("fundamental-react", "Tile")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def isDouble(value: Boolean): this.type = set("isDouble", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* event */ ReactMouseEventFrom[HTMLButtonElement] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => value(t0).runNow()))
    
    inline def size(value: s): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tile.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TileProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
