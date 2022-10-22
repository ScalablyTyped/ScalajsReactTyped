package typingsJapgolly.phaser

import typingsJapgolly.phaser.Phaser.Cameras.Scene2D.Camera
import typingsJapgolly.phaser.Phaser.GameObjects.Bob
import typingsJapgolly.phaser.Phaser.GameObjects.GameObject
import typingsJapgolly.phaser.Phaser.GameObjects.Light
import typingsJapgolly.phaser.Phaser.GameObjects.Text
import typingsJapgolly.phaser.Phaser.Geom.Triangle
import typingsJapgolly.phaser.Phaser.Renderer.WebGL.WebGLRenderer
import typingsJapgolly.phaser.Phaser.Tilemaps.Tile
import typingsJapgolly.phaser.Phaser.Types.Physics.Arcade.GameObjectWithBody
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ArcadePhysicsCallback = js.Function2[/* object1 */ GameObjectWithBody, /* object2 */ GameObjectWithBody, Unit]

type CameraRotateCallback = js.Function3[/* camera */ Camera, /* progress */ Double, /* angle */ Double, Unit]

type CenterFunction = js.Function1[/* triangle */ Triangle, Unit]

type ContentLoadedCallback = js.Function0[Unit]

/**
  * A filter that may be applied to a Context Choose operation.
  * 
  * 'NEW_CONTEXT_ONLY' - Prefer to only surface contexts the game has not been played in before.
  * 'INCLUDE_EXISTING_CHALLENGES' - Include the "Existing Challenges" section, which surfaces actively played-in contexts that the player is a part of.
  * 'NEW_PLAYERS_ONLY' - In sections containing individuals, prefer people who have not played the game.
  */
type ContextFilter = String

type CreateCallback = js.Function2[/* bob */ Bob, /* index */ Double, Unit]

type EachMapCallback[E] = js.Function2[/* key */ String, /* entry */ E, Unit]

type EachSetCallback[E] = js.Function2[/* entry */ E, /* index */ Double, Unit]

type EachTileCallback = js.Function3[/* value */ Tile, /* index */ Double, /* array */ js.Array[Tile], Unit]

type FindTileCallback = js.Function3[/* value */ Tile, /* index */ Double, /* array */ js.Array[Tile], Unit]

type LightForEach = js.Function1[/* light */ Light, Unit]

/**
  * A custom function that will be responsible for wrapping the text.
  */
type TextStyleWordWrapCallback = js.Function2[/* text */ String, /* textObject */ Text, Unit]

type TilemapFilterCallback = js.Function3[/* value */ GameObject, /* index */ Double, /* array */ js.Array[GameObject], Unit]

type TilemapFindCallback = js.Function3[/* value */ GameObject, /* index */ Double, /* array */ js.Array[GameObject], Unit]

type WebGLContextCallback = js.Function1[/* renderer */ WebGLRenderer, Unit]

type integer = Double
