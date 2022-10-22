package typingsJapgolly.athenajs

import org.scalajs.dom.HTMLElement
import typingsJapgolly.athenajs.anon.AIR
import typingsJapgolly.athenajs.mod.BitmapTextOptions
import typingsJapgolly.athenajs.mod.DisplayOptions
import typingsJapgolly.athenajs.mod.DrawableOptions
import typingsJapgolly.athenajs.mod.EffectOptions
import typingsJapgolly.athenajs.mod.FXInstance
import typingsJapgolly.athenajs.mod.GameOptions
import typingsJapgolly.athenajs.mod.JSObject
import typingsJapgolly.athenajs.mod.MapOptions
import typingsJapgolly.athenajs.mod.MenuOptions
import typingsJapgolly.athenajs.mod.PaintOptions
import typingsJapgolly.athenajs.mod.Promise
import typingsJapgolly.athenajs.mod.SceneOptions
import typingsJapgolly.athenajs.mod.SimpleTextOptions
import typingsJapgolly.athenajs.mod.SpriteOptions
import typingsJapgolly.athenajs.mod._AudioManager
import typingsJapgolly.athenajs.mod._Dom
import typingsJapgolly.athenajs.mod._InputManager
import typingsJapgolly.athenajs.mod._NotificationManager
import typingsJapgolly.athenajs.mod._ResourceManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AthenaJS {
    
    @JSGlobal("AthenaJS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("AthenaJS.AudioManager")
    @js.native
    val AudioManager: _AudioManager = js.native
    
    @JSGlobal("AthenaJS.Behavior")
    @js.native
    open class Behavior protected ()
      extends typingsJapgolly.athenajs.mod.Behavior {
      def this(sprite: typingsJapgolly.athenajs.mod.Drawable) = this()
      def this(sprite: typingsJapgolly.athenajs.mod.Drawable, options: JSObject) = this()
    }
    
    @JSGlobal("AthenaJS.BitmapText")
    @js.native
    open class BitmapText protected ()
      extends typingsJapgolly.athenajs.mod.BitmapText {
      def this(`type`: String, textOptions: BitmapTextOptions) = this()
    }
    
    @JSGlobal("AthenaJS.Deferred")
    @js.native
    open class Deferred ()
      extends typingsJapgolly.athenajs.mod.Deferred
    /* static members */
    object Deferred {
      
      @JSGlobal("AthenaJS.Deferred")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Creates and immediately resolves a new deferred.
        *
        */
      inline def resolve(): Promise = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[Promise]
      inline def resolve(`val`: Any): Promise = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(`val`.asInstanceOf[js.Any]).asInstanceOf[Promise]
    }
    
    @JSGlobal("AthenaJS.Display")
    @js.native
    open class Display protected ()
      extends typingsJapgolly.athenajs.mod.Display {
      /**
        * Creates a new Display instance
        *
        */
      def this(options: DisplayOptions, target: String) = this()
      def this(options: DisplayOptions, target: HTMLElement) = this()
    }
    
    inline def Dom(): _Dom[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("Dom")().asInstanceOf[_Dom[HTMLElement]]
    inline def Dom(sel: String): _Dom[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("Dom")(sel.asInstanceOf[js.Any]).asInstanceOf[_Dom[HTMLElement]]
    inline def Dom(sel: HTMLElement): _Dom[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("Dom")(sel.asInstanceOf[js.Any]).asInstanceOf[_Dom[HTMLElement]]
    
    @JSGlobal("AthenaJS.Drawable")
    @js.native
    open class Drawable protected ()
      extends typingsJapgolly.athenajs.mod.Drawable {
      def this(`type`: String, options: DrawableOptions) = this()
    }
    
    @JSGlobal("AthenaJS.Effect")
    @js.native
    open class Effect protected ()
      extends typingsJapgolly.athenajs.mod.Effect {
      /**
        * This the class constructor. Default options are:
        *
        */
      def this(options: EffectOptions, display: typingsJapgolly.athenajs.mod.Display) = this()
    }
    
    @JSGlobal("AthenaJS.FX")
    @js.native
    val FX: FXInstance = js.native
    
    @JSGlobal("AthenaJS.Game")
    @js.native
    open class Game protected ()
      extends typingsJapgolly.athenajs.mod.Game {
      def this(options: GameOptions) = this()
    }
    
    @JSGlobal("AthenaJS.InputManager")
    @js.native
    val InputManager: _InputManager = js.native
    
    @JSGlobal("AthenaJS.Map")
    @js.native
    open class Map protected ()
      extends typingsJapgolly.athenajs.mod.Map {
      def this(options: MapOptions) = this()
    }
    
    @JSGlobal("AthenaJS.MapEvent")
    @js.native
    open class MapEvent protected ()
      extends typingsJapgolly.athenajs.mod.MapEvent {
      /**
        * Creates a new MapEvent
        *
        */
      def this(map: typingsJapgolly.athenajs.mod.Map) = this()
    }
    
    @JSGlobal("AthenaJS.Menu")
    @js.native
    open class Menu protected ()
      extends typingsJapgolly.athenajs.mod.Menu {
      def this(id: String, options: MenuOptions) = this()
    }
    
    @JSGlobal("AthenaJS.NotificationManager")
    @js.native
    val NotificationManager: _NotificationManager = js.native
    
    @JSGlobal("AthenaJS.Paint")
    @js.native
    open class Paint protected ()
      extends typingsJapgolly.athenajs.mod.Paint {
      def this(`type`: String, paintOptions: PaintOptions) = this()
    }
    
    @JSGlobal("AthenaJS.ResourceManager")
    @js.native
    val ResourceManager: _ResourceManager = js.native
    
    @JSGlobal("AthenaJS.Scene")
    @js.native
    open class Scene ()
      extends typingsJapgolly.athenajs.mod.Scene {
      def this(options: SceneOptions) = this()
    }
    
    @JSGlobal("AthenaJS.SimpleText")
    @js.native
    open class SimpleText protected ()
      extends typingsJapgolly.athenajs.mod.SimpleText {
      def this(`type`: String, simpleTextOptions: SimpleTextOptions) = this()
    }
    
    @JSGlobal("AthenaJS.Sprite")
    @js.native
    open class Sprite protected ()
      extends typingsJapgolly.athenajs.mod.Sprite {
      def this(`type`: String, spriteOptions: SpriteOptions) = this()
    }
    
    @JSGlobal("AthenaJS.Tile")
    @js.native
    open class Tile protected ()
      extends typingsJapgolly.athenajs.mod.Tile {
      def this(options: JSObject) = this()
    }
    /* static members */
    object Tile {
      
      @JSGlobal("AthenaJS.Tile")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("AthenaJS.Tile.TYPE")
      @js.native
      def TYPE: AIR = js.native
      inline def TYPE_=(x: AIR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("AthenaJS._FX")
    @js.native
    /**
      * Creates the FX class, adding the linear easing
      */
    open class _FX ()
      extends typingsJapgolly.athenajs.mod._FX
  }
}
