package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object phaser {
  type ArcadePhysicsCallback = js.Function2[
    /* object1 */ typingsJapgolly.phaser.Phaser.GameObjects.GameObject, 
    /* object2 */ typingsJapgolly.phaser.Phaser.GameObjects.GameObject, 
    scala.Unit
  ]
  type CenterFunction = js.Function1[/* triangle */ typingsJapgolly.phaser.Phaser.Geom.Triangle, scala.Unit]
  type CollideCallback = js.Function3[
    /* body */ typingsJapgolly.phaser.Phaser.Physics.Impact.Body, 
    /* other */ typingsJapgolly.phaser.Phaser.Physics.Impact.Body, 
    /* axis */ java.lang.String, 
    scala.Unit
  ]
  type ContentLoadedCallback = js.Function0[scala.Unit]
  /**
    * A filter that may be applied to a Context Choose operation.
    * 
    * 'NEW_CONTEXT_ONLY' - Prefer to only surface contexts the game has not been played in before.
    * 'INCLUDE_EXISTING_CHALLENGES' - Include the "Existing Challenges" section, which surfaces actively played-in contexts that the player is a part of.
    * 'NEW_PLAYERS_ONLY' - In sections containing individuals, prefer people who have not played the game.
    */
  type ContextFilter = java.lang.String
  type CreateCallback = js.Function2[
    /* bob */ typingsJapgolly.phaser.Phaser.GameObjects.Bob, 
    /* index */ typingsJapgolly.phaser.integer, 
    scala.Unit
  ]
  type DataEachCallback = js.Function4[
    /* parent */ js.Any, 
    /* key */ java.lang.String, 
    /* value */ js.Any, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type EachContainerCallback[I] = js.Function2[/* item */ js.Any, /* repeated */ js.Any, scala.Unit]
  type EachListCallback[I] = js.Function2[/* item */ I, /* repeated */ js.Any, scala.Unit]
  type EachMapCallback[E] = js.Function2[/* key */ java.lang.String, /* entry */ E, scala.Unit]
  type EachSetCallback[E] = js.Function2[/* entry */ E, /* index */ scala.Double, scala.Unit]
  type EachTextureCallback = js.Function2[
    /* texture */ typingsJapgolly.phaser.Phaser.Textures.Texture, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type EachTileCallback = js.Function3[
    /* value */ typingsJapgolly.phaser.Phaser.Tilemaps.Tile, 
    /* index */ typingsJapgolly.phaser.integer, 
    /* array */ js.Array[typingsJapgolly.phaser.Phaser.Tilemaps.Tile], 
    scala.Unit
  ]
  type FindTileCallback = js.Function3[
    /* value */ typingsJapgolly.phaser.Phaser.Tilemaps.Tile, 
    /* index */ typingsJapgolly.phaser.integer, 
    /* array */ js.Array[typingsJapgolly.phaser.Phaser.Tilemaps.Tile], 
    scala.Unit
  ]
  type LightForEach = js.Function1[/* light */ typingsJapgolly.phaser.Phaser.GameObjects.Light, scala.Unit]
  /**
    * A custom function that will be responsible for wrapping the text.
    */
  type TextStyleWordWrapCallback = js.Function2[
    /* text */ java.lang.String, 
    /* textObject */ typingsJapgolly.phaser.Phaser.GameObjects.Text, 
    scala.Unit
  ]
  type TilemapFilterCallback = js.Function3[
    /* value */ typingsJapgolly.phaser.Phaser.GameObjects.GameObject, 
    /* index */ scala.Double, 
    /* array */ js.Array[typingsJapgolly.phaser.Phaser.GameObjects.GameObject], 
    scala.Unit
  ]
  type TilemapFindCallback = js.Function3[
    /* value */ typingsJapgolly.phaser.Phaser.GameObjects.GameObject, 
    /* index */ scala.Double, 
    /* array */ js.Array[typingsJapgolly.phaser.Phaser.GameObjects.GameObject], 
    scala.Unit
  ]
  type WebGLContextCallback = js.Function1[
    /* renderer */ typingsJapgolly.phaser.Phaser.Renderer.WebGL.WebGLRenderer, 
    scala.Unit
  ]
  type integer = scala.Double
}
