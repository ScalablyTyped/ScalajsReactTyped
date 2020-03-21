package typingsJapgolly.phaser.Phaser

import org.scalajs.dom.raw.WebGLTexture
import typingsJapgolly.phaser.EachTileCallback
import typingsJapgolly.phaser.FindTileCallback
import typingsJapgolly.phaser.Phaser.Cameras.Scene2D.Camera
import typingsJapgolly.phaser.Phaser.GameObjects.Components.Alpha
import typingsJapgolly.phaser.Phaser.GameObjects.Components.BlendMode
import typingsJapgolly.phaser.Phaser.GameObjects.Components.ComputedSize
import typingsJapgolly.phaser.Phaser.GameObjects.Components.Depth
import typingsJapgolly.phaser.Phaser.GameObjects.Components.Flip
import typingsJapgolly.phaser.Phaser.GameObjects.Components.GetBounds
import typingsJapgolly.phaser.Phaser.GameObjects.Components.Origin
import typingsJapgolly.phaser.Phaser.GameObjects.Components.Pipeline
import typingsJapgolly.phaser.Phaser.GameObjects.Components.ScrollFactor
import typingsJapgolly.phaser.Phaser.GameObjects.Components.Transform
import typingsJapgolly.phaser.Phaser.GameObjects.Components.Visible
import typingsJapgolly.phaser.Phaser.GameObjects.GameObject
import typingsJapgolly.phaser.Phaser.GameObjects.Graphics
import typingsJapgolly.phaser.Phaser.GameObjects.Sprite
import typingsJapgolly.phaser.Phaser.Geom.Circle
import typingsJapgolly.phaser.Phaser.Geom.Line
import typingsJapgolly.phaser.Phaser.Geom.Rectangle
import typingsJapgolly.phaser.Phaser.Geom.Triangle
import typingsJapgolly.phaser.Phaser.Math.Vector2
import typingsJapgolly.phaser.Phaser.Textures.Texture
import typingsJapgolly.phaser.Phaser.Types.GameObjects.Sprite.SpriteConfig
import typingsJapgolly.phaser.Phaser.Types.Tilemaps.FilteringOptions
import typingsJapgolly.phaser.Phaser.Types.Tilemaps.MapDataConfig
import typingsJapgolly.phaser.Phaser.Types.Tilemaps.ObjectLayerConfig
import typingsJapgolly.phaser.Phaser.Types.Tilemaps.StyleConfig
import typingsJapgolly.phaser.Phaser.Types.Tilemaps.TiledObject
import typingsJapgolly.phaser.TilemapFilterCallback
import typingsJapgolly.phaser.TilemapFindCallback
import typingsJapgolly.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Tilemaps")
@js.native
object Tilemaps extends js.Object {
  /**
    * A Dynamic Tilemap Layer is a Game Object that renders LayerData from a Tilemap when used in combination
    * with one, or more, Tilesets.
    * 
    * A Dynamic Tilemap Layer trades some speed for being able to apply powerful effects. Unlike a
    * Static Tilemap Layer, you can apply per-tile effects like tint or alpha, and you can change the
    * tiles in a DynamicTilemapLayer.
    * 
    * Use this over a Static Tilemap Layer when you need those features.
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.phaser.Phaser.Types.Physics.Arcade._ArcadeColliderType because Already inherited */ @js.native
  class DynamicTilemapLayer protected ()
    extends GameObject
       with Alpha
       with BlendMode
       with ComputedSize
       with Depth
       with Flip
       with GetBounds
       with Origin
       with Pipeline
       with ScrollFactor
       with Transform
       with Visible {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs.
      * @param tilemap The Tilemap this layer is a part of.
      * @param layerIndex The index of the LayerData associated with this layer.
      * @param tileset The tileset, or an array of tilesets, used to render this layer. Can be a string or a Tileset object.
      * @param x The world x position where the top left of this layer will be placed. Default 0.
      * @param y The world y position where the top left of this layer will be placed. Default 0.
      */
    def this(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: String) = this()
    def this(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: js.Array[String | Tileset]) = this()
    def this(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: Tileset) = this()
    def this(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: String, x: Double) = this()
    def this(
      scene: Scene,
      tilemap: Tilemap,
      layerIndex: integer,
      tileset: js.Array[String | Tileset],
      x: Double
    ) = this()
    def this(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: Tileset, x: Double) = this()
    def this(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: String, x: Double, y: Double) = this()
    def this(
      scene: Scene,
      tilemap: Tilemap,
      layerIndex: integer,
      tileset: js.Array[String | Tileset],
      x: Double,
      y: Double
    ) = this()
    def this(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: Tileset, x: Double, y: Double) = this()
    /**
      * The callback that is invoked when the tiles are culled.
      * 
      * By default it will call `TilemapComponents.CullTiles` but you can override this to call any function you like.
      * 
      * It will be sent 3 arguments:
      * 
      * 1. The Phaser.Tilemaps.LayerData object for this Layer
      * 2. The Camera that is culling the layer. You can check its `dirty` property to see if it has changed since the last cull.
      * 3. A reference to the `culledTiles` array, which should be used to store the tiles you want rendered.
      * 
      * See the `TilemapComponents.CullTiles` source code for details on implementing your own culling system.
      */
    var cullCallback: js.Function = js.native
    /**
      * The amount of extra tiles to add into the cull rectangle when calculating its horizontal size.
      * 
      * See the method `setCullPadding` for more details.
      */
    var cullPaddingX: integer = js.native
    /**
      * The amount of extra tiles to add into the cull rectangle when calculating its vertical size.
      * 
      * See the method `setCullPadding` for more details.
      */
    var cullPaddingY: integer = js.native
    /**
      * Used internally with the canvas render. This holds the tiles that are visible within the
      * camera.
      */
    var culledTiles: js.Array[_] = js.native
    /**
      * The depth of this Game Object within the Scene.
      * 
      * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
      * of Game Objects, without actually moving their position in the display list.
      * 
      * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
      * value will always render in front of one with a lower value.
      * 
      * Setting the depth will queue a depth sort event within the Scene.
      */
    /* CompleteClass */
    override var depth: Double = js.native
    /**
      * The displayed height of this Game Object.
      * 
      * This value takes into account the scale factor.
      * 
      * Setting this value will adjust the Game Object's scale property.
      */
    /* CompleteClass */
    override var displayHeight: Double = js.native
    /**
      * The displayed width of this Game Object.
      * 
      * This value takes into account the scale factor.
      * 
      * Setting this value will adjust the Game Object's scale property.
      */
    /* CompleteClass */
    override var displayWidth: Double = js.native
    /**
      * The horizontally flipped state of the Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override var flipX: Boolean = js.native
    /**
      * The vertically flipped state of the Game Object.
      * 
      * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override var flipY: Boolean = js.native
    /**
      * An array holding the mapping between the tile indexes and the tileset they belong to.
      */
    var gidMap: js.Array[Tileset] = js.native
    /**
      * The native (un-scaled) height of this Game Object.
      * 
      * Changing this value will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or use
      * the `displayHeight` property.
      */
    /* CompleteClass */
    override var height: Double = js.native
    /**
      * Used internally by physics system to perform fast type checks.
      */
    val isTilemap: Boolean = js.native
    /**
      * The LayerData associated with this layer. LayerData can only be associated with one
      * tilemap layer.
      */
    var layer: LayerData = js.native
    /**
      * The index of the LayerData associated with this layer.
      */
    var layerIndex: integer = js.native
    /**
      * You can control if the Cameras should cull tiles before rendering them or not.
      * By default the camera will try to cull the tiles in this layer, to avoid over-drawing to the renderer.
      * 
      * However, there are some instances when you may wish to disable this, and toggling this flag allows
      * you to do so. Also see `setSkipCull` for a chainable method that does the same thing.
      */
    var skipCull: Boolean = js.native
    /**
      * The Tilemap that this layer is a part of.
      */
    var tilemap: Tilemap = js.native
    /**
      * The total number of tiles drawn by the renderer in the last frame.
      */
    val tilesDrawn: integer = js.native
    /**
      * The total number of tiles in this layer. Updated every frame.
      */
    val tilesTotal: integer = js.native
    /**
      * The Tileset/s associated with this layer.
      * 
      * As of Phaser 3.14 this property is now an array of Tileset objects, previously it was a single reference.
      */
    var tileset: js.Array[Tileset] = js.native
    /**
      * The visible state of the Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      */
    /* CompleteClass */
    override var visible: Boolean = js.native
    /**
      * The native (un-scaled) width of this Game Object.
      * 
      * Changing this value will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or use
      * the `displayWidth` property.
      */
    /* CompleteClass */
    override var width: Double = js.native
    /**
      * Calculates interesting faces at the given tile coordinates of the specified layer. Interesting
      * faces are used internally for optimizing collisions against tiles. This method is mostly used
      * internally to optimize recalculating faces when only one tile has been changed.
      * @param tileX The x coordinate.
      * @param tileY The y coordinate.
      */
    def calculateFacesAt(tileX: integer, tileY: integer): DynamicTilemapLayer = js.native
    /**
      * Calculates interesting faces within the rectangular area specified (in tile coordinates) of the
      * layer. Interesting faces are used internally for optimizing collisions against tiles. This method
      * is mostly used internally.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      */
    def calculateFacesWithin(): DynamicTilemapLayer = js.native
    def calculateFacesWithin(tileX: integer): DynamicTilemapLayer = js.native
    def calculateFacesWithin(tileX: integer, tileY: integer): DynamicTilemapLayer = js.native
    def calculateFacesWithin(tileX: integer, tileY: integer, width: integer): DynamicTilemapLayer = js.native
    def calculateFacesWithin(tileX: integer, tileY: integer, width: integer, height: integer): DynamicTilemapLayer = js.native
    /**
      * Copies the tiles in the source rectangular area to a new destination (all specified in tile
      * coordinates) within the layer. This copies all tile properties & recalculates collision
      * information in the destination region.
      * @param srcTileX The x coordinate of the area to copy from, in tiles, not pixels.
      * @param srcTileY The y coordinate of the area to copy from, in tiles, not pixels.
      * @param width The width of the area to copy, in tiles, not pixels.
      * @param height The height of the area to copy, in tiles, not pixels.
      * @param destTileX The x coordinate of the area to copy to, in tiles, not pixels.
      * @param destTileY The y coordinate of the area to copy to, in tiles, not pixels.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      */
    def copy(
      srcTileX: integer,
      srcTileY: integer,
      width: integer,
      height: integer,
      destTileX: integer,
      destTileY: integer
    ): DynamicTilemapLayer = js.native
    def copy(
      srcTileX: integer,
      srcTileY: integer,
      width: integer,
      height: integer,
      destTileX: integer,
      destTileY: integer,
      recalculateFaces: Boolean
    ): DynamicTilemapLayer = js.native
    def createFromTiles(indexes: js.Array[_], replacements: js.Array[_], spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
    def createFromTiles(indexes: js.Array[_], replacements: js.Array[_], spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: js.Array[_],
      replacements: js.Array[_],
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera
    ): js.Array[Sprite] = js.native
    def createFromTiles(indexes: js.Array[_], replacements: integer, spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
    def createFromTiles(indexes: js.Array[_], replacements: integer, spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: js.Array[_],
      replacements: integer,
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera
    ): js.Array[Sprite] = js.native
    def createFromTiles(indexes: integer, replacements: js.Array[_], spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
    def createFromTiles(indexes: integer, replacements: js.Array[_], spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: integer,
      replacements: js.Array[_],
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera
    ): js.Array[Sprite] = js.native
    /**
      * Creates a Sprite for every object matching the given tile indexes in the layer. You can
      * optionally specify if each tile will be replaced with a new tile after the Sprite has been
      * created. This is useful if you want to lay down special tiles in a level that are converted to
      * Sprites, but want to replace the tile itself with a floor tile or similar once converted.
      * @param indexes The tile index, or array of indexes, to create Sprites from.
      * @param replacements The tile index, or array of indexes, to change a converted
      * tile to. Set to `null` to leave the tiles unchanged. If an array is given, it is assumed to be a
      * one-to-one mapping with the indexes array.
      * @param spriteConfig The config object to pass into the Sprite creator (i.e.
      * scene.make.sprite).
      * @param scene The Scene to create the Sprites within. Default scene the map is within.
      * @param camera The Camera to use when determining the world XY Default main camera.
      */
    def createFromTiles(indexes: integer, replacements: integer, spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
    def createFromTiles(indexes: integer, replacements: integer, spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(indexes: integer, replacements: integer, spriteConfig: SpriteConfig, scene: Scene, camera: Camera): js.Array[Sprite] = js.native
    /**
      * Returns the tiles in the given layer that are within the cameras viewport.
      * This is used internally.
      * @param camera The Camera to run the cull check against.
      */
    def cull(): js.Array[Tile] = js.native
    def cull(camera: Camera): js.Array[Tile] = js.native
    /**
      * Sets the tiles in the given rectangular area (in tile coordinates) of the layer with the
      * specified index. Tiles will be set to collide if the given index is a colliding index.
      * Collision information in the region will be recalculated.
      * @param index The tile index to fill the area with.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      */
    def fill(index: integer): DynamicTilemapLayer = js.native
    def fill(index: integer, tileX: integer): DynamicTilemapLayer = js.native
    def fill(index: integer, tileX: integer, tileY: integer): DynamicTilemapLayer = js.native
    def fill(index: integer, tileX: integer, tileY: integer, width: integer): DynamicTilemapLayer = js.native
    def fill(index: integer, tileX: integer, tileY: integer, width: integer, height: integer): DynamicTilemapLayer = js.native
    def fill(
      index: integer,
      tileX: integer,
      tileY: integer,
      width: integer,
      height: integer,
      recalculateFaces: Boolean
    ): DynamicTilemapLayer = js.native
    /**
      * For each tile in the given rectangular area (in tile coordinates) of the layer, run the given
      * filter callback function. Any tiles that pass the filter test (i.e. where the callback returns
      * true) will returned as a new array. Similar to Array.prototype.Filter in vanilla JS.
      * @param callback The callback. Each tile in the given area will be passed to this
      * callback as the first and only parameter. The callback should return true for tiles that pass the
      * filter.
      * @param context The context under which the callback should be run.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area to filter. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area to filter. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      */
    def filterTiles(
      callback: js.Function,
      context: js.UndefOr[js.Object],
      tileX: js.UndefOr[integer],
      tileY: js.UndefOr[integer],
      width: js.UndefOr[integer],
      height: js.UndefOr[integer],
      filteringOptions: js.UndefOr[FilteringOptions]
    ): js.Array[Tile] = js.native
    /**
      * Searches the entire map layer for the first tile matching the given index, then returns that Tile
      * object. If no match is found, it returns null. The search starts from the top-left tile and
      * continues horizontally until it hits the end of the row, then it drops down to the next column.
      * If the reverse boolean is true, it scans starting from the bottom-right corner traveling up to
      * the top-left.
      * @param index The tile index value to search for.
      * @param skip The number of times to skip a matching tile before returning. Default 0.
      * @param reverse If true it will scan the layer in reverse, starting at the
      * bottom-right. Otherwise it scans from the top-left. Default false.
      */
    def findByIndex(index: integer): Tile = js.native
    def findByIndex(index: integer, skip: integer): Tile = js.native
    def findByIndex(index: integer, skip: integer, reverse: Boolean): Tile = js.native
    /**
      * Find the first tile in the given rectangular area (in tile coordinates) of the layer that
      * satisfies the provided testing function. I.e. finds the first tile for which `callback` returns
      * true. Similar to Array.prototype.find in vanilla JS.
      * @param callback The callback. Each tile in the given area will be passed to this callback as the first and only parameter.
      * @param context The context under which the callback should be run.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area to search. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area to search. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      */
    def findTile(
      callback: FindTileCallback,
      context: js.UndefOr[js.Object],
      tileX: js.UndefOr[integer],
      tileY: js.UndefOr[integer],
      width: js.UndefOr[integer],
      height: js.UndefOr[integer],
      filteringOptions: js.UndefOr[FilteringOptions]
    ): Tile = js.native
    /**
      * For each tile in the given rectangular area (in tile coordinates) of the layer, run the given
      * callback. Similar to Array.prototype.forEach in vanilla JS.
      * @param callback The callback. Each tile in the given area will be passed to this callback as the first and only parameter.
      * @param context The context under which the callback should be run.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area to search. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area to search. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      */
    def forEachTile(
      callback: EachTileCallback,
      context: js.UndefOr[js.Object],
      tileX: js.UndefOr[integer],
      tileY: js.UndefOr[integer],
      width: js.UndefOr[integer],
      height: js.UndefOr[integer],
      filteringOptions: js.UndefOr[FilteringOptions]
    ): DynamicTilemapLayer = js.native
    /**
      * Gets a tile at the given tile coordinates from the given layer.
      * @param tileX X position to get the tile from (given in tile units, not pixels).
      * @param tileY Y position to get the tile from (given in tile units, not pixels).
      * @param nonNull If true getTile won't return null for empty tiles, but a Tile object with an index of -1. Default false.
      */
    def getTileAt(tileX: integer, tileY: integer): Tile = js.native
    def getTileAt(tileX: integer, tileY: integer, nonNull: Boolean): Tile = js.native
    /**
      * Gets a tile at the given world coordinates from the given layer.
      * @param worldX X position to get the tile from (given in pixels)
      * @param worldY Y position to get the tile from (given in pixels)
      * @param nonNull If true, function won't return null for empty tiles, but a Tile object with an index of -1. Default false.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      */
    def getTileAtWorldXY(worldX: Double, worldY: Double): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Camera): Tile = js.native
    /**
      * Gets the tiles in the given rectangular area (in tile coordinates) of the layer.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      */
    def getTilesWithin(): js.Array[Tile] = js.native
    def getTilesWithin(tileX: integer): js.Array[Tile] = js.native
    def getTilesWithin(tileX: integer, tileY: integer): js.Array[Tile] = js.native
    def getTilesWithin(tileX: integer, tileY: integer, width: integer): js.Array[Tile] = js.native
    def getTilesWithin(tileX: integer, tileY: integer, width: integer, height: integer): js.Array[Tile] = js.native
    def getTilesWithin(
      tileX: integer,
      tileY: integer,
      width: integer,
      height: integer,
      filteringOptions: FilteringOptions
    ): js.Array[Tile] = js.native
    /**
      * Gets the tiles that overlap with the given shape in the given layer. The shape must be a Circle,
      * Line, Rectangle or Triangle. The shape should be in world coordinates.
      * @param shape A shape in world (pixel) coordinates
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param camera The Camera to use when factoring in which tiles to return. Default main camera.
      */
    def getTilesWithinShape(shape: Circle): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Circle, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Circle, filteringOptions: FilteringOptions, camera: Camera): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Line): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Line, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Line, filteringOptions: FilteringOptions, camera: Camera): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Rectangle): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Rectangle, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Rectangle, filteringOptions: FilteringOptions, camera: Camera): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Triangle): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Triangle, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Triangle, filteringOptions: FilteringOptions, camera: Camera): js.Array[Tile] = js.native
    /**
      * Gets the tiles in the given rectangular area (in world coordinates) of the layer.
      * @param worldX The world x coordinate for the top-left of the area.
      * @param worldY The world y coordinate for the top-left of the area.
      * @param width The width of the area.
      * @param height The height of the area.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param camera The Camera to use when factoring in which tiles to return. Default main camera.
      */
    def getTilesWithinWorldXY(worldX: Double, worldY: Double, width: Double, height: Double): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(worldX: Double, worldY: Double, width: Double, height: Double, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(
      worldX: Double,
      worldY: Double,
      width: Double,
      height: Double,
      filteringOptions: FilteringOptions,
      camera: Camera
    ): js.Array[Tile] = js.native
    /**
      * Checks if there is a tile at the given location (in tile coordinates) in the given layer. Returns
      * false if there is no tile or if the tile at that location has an index of -1.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      */
    def hasTileAt(tileX: integer, tileY: integer): Boolean = js.native
    /**
      * Checks if there is a tile at the given location (in world coordinates) in the given layer. Returns
      * false if there is no tile or if the tile at that location has an index of -1.
      * @param worldX The x coordinate, in pixels.
      * @param worldY The y coordinate, in pixels.
      * @param camera The Camera to use when factoring in which tiles to return. Default main camera.
      */
    def hasTileAtWorldXY(worldX: Double, worldY: Double): Boolean = js.native
    def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Camera): Boolean = js.native
    def putTileAt(tile: Tile, tileX: integer, tileY: integer): Tile = js.native
    def putTileAt(tile: Tile, tileX: integer, tileY: integer, recalculateFaces: Boolean): Tile = js.native
    /**
      * Puts a tile at the given tile coordinates in the specified layer. You can pass in either an index
      * or a Tile object. If you pass in a Tile, all attributes will be copied over to the specified
      * location. If you pass in an index, only the index at the specified location will be changed.
      * Collision information will be recalculated at the specified location.
      * @param tile The index of this tile to set or a Tile object.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      */
    def putTileAt(tile: integer, tileX: integer, tileY: integer): Tile = js.native
    def putTileAt(tile: integer, tileX: integer, tileY: integer, recalculateFaces: Boolean): Tile = js.native
    def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double): Tile = js.native
    def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double, recalculateFaces: Boolean): Tile = js.native
    def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double, recalculateFaces: Boolean, camera: Camera): Tile = js.native
    /**
      * Puts a tile at the given world coordinates (pixels) in the specified layer. You can pass in either
      * an index or a Tile object. If you pass in a Tile, all attributes will be copied over to the
      * specified location. If you pass in an index, only the index at the specified location will be
      * changed. Collision information will be recalculated at the specified location.
      * @param tile The index of this tile to set or a Tile object.
      * @param worldX The x coordinate, in pixels.
      * @param worldY The y coordinate, in pixels.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      */
    def putTileAtWorldXY(tile: integer, worldX: Double, worldY: Double): Tile = js.native
    def putTileAtWorldXY(tile: integer, worldX: Double, worldY: Double, recalculateFaces: Boolean): Tile = js.native
    def putTileAtWorldXY(tile: integer, worldX: Double, worldY: Double, recalculateFaces: Boolean, camera: Camera): Tile = js.native
    /**
      * Puts an array of tiles or a 2D array of tiles at the given tile coordinates in the specified
      * layer. The array can be composed of either tile indexes or Tile objects. If you pass in a Tile,
      * all attributes will be copied over to the specified location. If you pass in an index, only the
      * index at the specified location will be changed. Collision information will be recalculated
      * within the region tiles were changed.
      * @param tile A row (array) or grid (2D array) of Tiles or tile indexes to place.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      */
    def putTilesAt(tile: js.Array[(js.Array[Tile | integer]) | Tile | integer], tileX: integer, tileY: integer): DynamicTilemapLayer = js.native
    def putTilesAt(
      tile: js.Array[(js.Array[Tile | integer]) | Tile | integer],
      tileX: integer,
      tileY: integer,
      recalculateFaces: Boolean
    ): DynamicTilemapLayer = js.native
    /**
      * Randomizes the indexes of a rectangular region of tiles (in tile coordinates) within the
      * specified layer. Each tile will receive a new index. If an array of indexes is passed in, then
      * those will be used for randomly assigning new tile indexes. If an array is not provided, the
      * indexes found within the region (excluding -1) will be used for randomly assigning new tile
      * indexes. This method only modifies tile indexes and does not change collision information.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param indexes An array of indexes to randomly draw from during randomization.
      */
    def randomize(): DynamicTilemapLayer = js.native
    def randomize(tileX: integer): DynamicTilemapLayer = js.native
    def randomize(tileX: integer, tileY: integer): DynamicTilemapLayer = js.native
    def randomize(tileX: integer, tileY: integer, width: integer): DynamicTilemapLayer = js.native
    def randomize(tileX: integer, tileY: integer, width: integer, height: integer): DynamicTilemapLayer = js.native
    def randomize(tileX: integer, tileY: integer, width: integer, height: integer, indexes: js.Array[integer]): DynamicTilemapLayer = js.native
    /**
      * Removes the tile at the given tile coordinates in the specified layer and updates the layer's
      * collision information.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param replaceWithNull If true, this will replace the tile at the specified location with null instead of a Tile with an index of -1. Default true.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      */
    def removeTileAt(tileX: integer, tileY: integer): Tile = js.native
    def removeTileAt(tileX: integer, tileY: integer, replaceWithNull: Boolean): Tile = js.native
    def removeTileAt(tileX: integer, tileY: integer, replaceWithNull: Boolean, recalculateFaces: Boolean): Tile = js.native
    /**
      * Removes the tile at the given world coordinates in the specified layer and updates the layer's
      * collision information.
      * @param worldX The x coordinate, in pixels.
      * @param worldY The y coordinate, in pixels.
      * @param replaceWithNull If true, this will replace the tile at the specified location with null instead of a Tile with an index of -1. Default true.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      */
    def removeTileAtWorldXY(worldX: Double, worldY: Double): Tile = js.native
    def removeTileAtWorldXY(worldX: Double, worldY: Double, replaceWithNull: Boolean): Tile = js.native
    def removeTileAtWorldXY(worldX: Double, worldY: Double, replaceWithNull: Boolean, recalculateFaces: Boolean): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Boolean,
      camera: Camera
    ): Tile = js.native
    /**
      * Draws a debug representation of the layer to the given Graphics. This is helpful when you want to
      * get a quick idea of which of your tiles are colliding and which have interesting faces. The tiles
      * are drawn starting at (0, 0) in the Graphics, allowing you to place the debug representation
      * wherever you want on the screen.
      * @param graphics The target Graphics object to draw upon.
      * @param styleConfig An object specifying the colors to use for the debug drawing.
      */
    def renderDebug(graphics: Graphics, styleConfig: StyleConfig): DynamicTilemapLayer = js.native
    /**
      * Scans the given rectangular area (given in tile coordinates) for tiles with an index matching
      * `findIndex` and updates their index to match `newIndex`. This only modifies the index and does
      * not change collision information.
      * @param findIndex The index of the tile to search for.
      * @param newIndex The index of the tile to replace it with.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      */
    def replaceByIndex(findIndex: integer, newIndex: integer): DynamicTilemapLayer = js.native
    def replaceByIndex(findIndex: integer, newIndex: integer, tileX: integer): DynamicTilemapLayer = js.native
    def replaceByIndex(findIndex: integer, newIndex: integer, tileX: integer, tileY: integer): DynamicTilemapLayer = js.native
    def replaceByIndex(findIndex: integer, newIndex: integer, tileX: integer, tileY: integer, width: integer): DynamicTilemapLayer = js.native
    def replaceByIndex(
      findIndex: integer,
      newIndex: integer,
      tileX: integer,
      tileY: integer,
      width: integer,
      height: integer
    ): DynamicTilemapLayer = js.native
    /**
      * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
      */
    /* CompleteClass */
    override def resetFlip(): this.type = js.native
    def setCollision(indexes: js.Array[_]): Tilemap = js.native
    def setCollision(indexes: js.Array[_], collides: Boolean): Tilemap = js.native
    def setCollision(indexes: js.Array[_], collides: Boolean, recalculateFaces: Boolean): Tilemap = js.native
    def setCollision(indexes: js.Array[_], collides: Boolean, recalculateFaces: Boolean, updateLayer: Boolean): Tilemap = js.native
    /**
      * Sets collision on the given tile or tiles within a layer by index. You can pass in either a
      * single numeric index or an array of indexes: [2, 3, 15, 20]. The `collides` parameter controls if
      * collision will be enabled (true) or disabled (false).
      * 
      * If no layer specified, the map's current layer is used.
      * @param indexes Either a single tile index, or an array of tile indexes.
      * @param collides If true it will enable collision. If false it will clear collision. Default true.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update. Default true.
      * @param updateLayer If true, updates the current tiles on the layer. Set to
      * false if no tiles have been placed for significant performance boost. Default true.
      */
    def setCollision(indexes: integer): Tilemap = js.native
    def setCollision(indexes: integer, collides: Boolean): Tilemap = js.native
    def setCollision(indexes: integer, collides: Boolean, recalculateFaces: Boolean): Tilemap = js.native
    def setCollision(indexes: integer, collides: Boolean, recalculateFaces: Boolean, updateLayer: Boolean): Tilemap = js.native
    /**
      * Sets collision on a range of tiles in a layer whose index is between the specified `start` and
      * `stop` (inclusive). Calling this with a start value of 10 and a stop value of 14 would set
      * collision for tiles 10, 11, 12, 13 and 14. The `collides` parameter controls if collision will be
      * enabled (true) or disabled (false).
      * @param start The first index of the tile to be set for collision.
      * @param stop The last index of the tile to be set for collision.
      * @param collides If true it will enable collision. If false it will clear collision. Default true.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update. Default true.
      */
    def setCollisionBetween(start: integer, stop: integer): DynamicTilemapLayer = js.native
    def setCollisionBetween(start: integer, stop: integer, collides: Boolean): DynamicTilemapLayer = js.native
    def setCollisionBetween(start: integer, stop: integer, collides: Boolean, recalculateFaces: Boolean): DynamicTilemapLayer = js.native
    /**
      * Sets collision on all tiles in the given layer, except for tiles that have an index specified in
      * the given array. The `collides` parameter controls if collision will be enabled (true) or
      * disabled (false).
      * @param indexes An array of the tile indexes to not be counted for collision.
      * @param collides If true it will enable collision. If false it will clear collision. Default true.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update. Default true.
      */
    def setCollisionByExclusion(indexes: js.Array[integer]): DynamicTilemapLayer = js.native
    def setCollisionByExclusion(indexes: js.Array[integer], collides: Boolean): DynamicTilemapLayer = js.native
    def setCollisionByExclusion(indexes: js.Array[integer], collides: Boolean, recalculateFaces: Boolean): DynamicTilemapLayer = js.native
    /**
      * Sets collision on the tiles within a layer by checking tile properties. If a tile has a property
      * that matches the given properties object, its collision flag will be set. The `collides`
      * parameter controls if collision will be enabled (true) or disabled (false). Passing in
      * `{ collides: true }` would update the collision flag on any tiles with a "collides" property that
      * has a value of true. Any tile that doesn't have "collides" set to true will be ignored. You can
      * also use an array of values, e.g. `{ types: ["stone", "lava", "sand" ] }`. If a tile has a
      * "types" property that matches any of those values, its collision flag will be updated.
      * @param properties An object with tile properties and corresponding values that should be checked.
      * @param collides If true it will enable collision. If false it will clear collision. Default true.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update. Default true.
      */
    def setCollisionByProperty(properties: js.Object): DynamicTilemapLayer = js.native
    def setCollisionByProperty(properties: js.Object, collides: Boolean): DynamicTilemapLayer = js.native
    def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Boolean): DynamicTilemapLayer = js.native
    /**
      * Sets collision on the tiles within a layer by checking each tiles collision group data
      * (typically defined in Tiled within the tileset collision editor). If any objects are found within
      * a tiles collision group, the tile's colliding information will be set. The `collides` parameter
      * controls if collision will be enabled (true) or disabled (false).
      * @param collides If true it will enable collision. If false it will clear collision. Default true.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update. Default true.
      */
    def setCollisionFromCollisionGroup(): DynamicTilemapLayer = js.native
    def setCollisionFromCollisionGroup(collides: Boolean): DynamicTilemapLayer = js.native
    def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Boolean): DynamicTilemapLayer = js.native
    /**
      * When a Camera culls the tiles in this layer it does so using its view into the world, building up a
      * rectangle inside which the tiles must exist or they will be culled. Sometimes you may need to expand the size
      * of this 'cull rectangle', especially if you plan on rotating the Camera viewing the layer. Do so
      * by providing the padding values. The values given are in tiles, not pixels. So if the tile width was 32px
      * and you set `paddingX` to be 4, it would add 32px x 4 to the cull rectangle (adjusted for scale)
      * @param paddingX The amount of extra horizontal tiles to add to the cull check padding. Default 1.
      * @param paddingY The amount of extra vertical tiles to add to the cull check padding. Default 1.
      */
    def setCullPadding(): this.type = js.native
    def setCullPadding(paddingX: integer): this.type = js.native
    def setCullPadding(paddingX: integer, paddingY: integer): this.type = js.native
    /**
      * The depth of this Game Object within the Scene.
      * 
      * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
      * of Game Objects, without actually moving their position in the display list.
      * 
      * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
      * value will always render in front of one with a lower value.
      * 
      * Setting the depth will queue a depth sort event within the Scene.
      * @param value The depth of this Game Object.
      */
    /* CompleteClass */
    override def setDepth(value: integer): this.type = js.native
    /**
      * Sets the display size of this Game Object.
      * 
      * Calling this will adjust the scale.
      * @param width The width of this Game Object.
      * @param height The height of this Game Object.
      */
    /* CompleteClass */
    override def setDisplaySize(width: Double, height: Double): this.type = js.native
    /**
      * Sets the horizontal and vertical flipped state of this Game Object.
      * 
      * A Game Object that is flipped will render inversed on the flipped axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
      * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlip(x: Boolean, y: Boolean): this.type = js.native
    /**
      * Sets the horizontal flipped state of this Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      * @param value The flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlipX(value: Boolean): this.type = js.native
    /**
      * Sets the vertical flipped state of this Game Object.
      * @param value The flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlipY(value: Boolean): this.type = js.native
    def setRenderOrder(renderOrder: String): this.type = js.native
    /**
      * Sets the rendering (draw) order of the tiles in this layer.
      * 
      * The default is 'right-down', meaning it will order the tiles starting from the top-left,
      * drawing to the right and then moving down to the next row.
      * 
      * The draw orders are:
      * 
      * 0 = right-down
      * 1 = left-down
      * 2 = right-up
      * 3 = left-up
      * 
      * Setting the render order does not change the tiles or how they are stored in the layer,
      * it purely impacts the order in which they are rendered.
      * 
      * You can provide either an integer (0 to 3), or the string version of the order.
      * @param renderOrder The render (draw) order value. Either an integer between 0 and 3, or a string: 'right-down', 'left-down', 'right-up' or 'left-up'.
      */
    def setRenderOrder(renderOrder: integer): this.type = js.native
    /**
      * Sets the internal size of this Game Object, as used for frame or physics body creation.
      * 
      * This will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or call the
      * `setDisplaySize` method, which is the same thing as changing the scale but allows you
      * to do so by giving pixel values.
      * 
      * If you have enabled this Game Object for input, changing the size will _not_ change the
      * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
      * @param width The width of this Game Object.
      * @param height The height of this Game Object.
      */
    /* CompleteClass */
    override def setSize(width: Double, height: Double): this.type = js.native
    /**
      * You can control if the Cameras should cull tiles before rendering them or not.
      * By default the camera will try to cull the tiles in this layer, to avoid over-drawing to the renderer.
      * 
      * However, there are some instances when you may wish to disable this.
      * @param value Set to `true` to stop culling tiles. Set to `false` to enable culling again. Default true.
      */
    def setSkipCull(): this.type = js.native
    def setSkipCull(value: Boolean): this.type = js.native
    def setTileIndexCallback(indexes: js.Array[integer], callback: js.Function, callbackContext: js.Object): DynamicTilemapLayer = js.native
    /**
      * Sets a global collision callback for the given tile index within the layer. This will affect all
      * tiles on this layer that have the same index. If a callback is already set for the tile index it
      * will be replaced. Set the callback to null to remove it. If you want to set a callback for a tile
      * at a specific location on the map then see setTileLocationCallback.
      * @param indexes Either a single tile index, or an array of tile indexes to have a collision callback set for.
      * @param callback The callback that will be invoked when the tile is collided with.
      * @param callbackContext The context under which the callback is called.
      */
    def setTileIndexCallback(indexes: integer, callback: js.Function, callbackContext: js.Object): DynamicTilemapLayer = js.native
    /**
      * Sets a collision callback for the given rectangular area (in tile coordinates) within the layer.
      * If a callback is already set for the tile index it will be replaced. Set the callback to null to
      * remove it.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param callback The callback that will be invoked when the tile is collided with.
      * @param callbackContext The context under which the callback is called.
      */
    def setTileLocationCallback(
      tileX: js.UndefOr[integer],
      tileY: js.UndefOr[integer],
      width: js.UndefOr[integer],
      height: js.UndefOr[integer],
      callback: js.UndefOr[js.Function],
      callbackContext: js.UndefOr[js.Object]
    ): DynamicTilemapLayer = js.native
    /**
      * Sets the visibility of this Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      * @param value The visible state of the Game Object.
      */
    /* CompleteClass */
    override def setVisible(value: Boolean): this.type = js.native
    /**
      * Shuffles the tiles in a rectangular region (specified in tile coordinates) within the given
      * layer. It will only randomize the tiles in that area, so if they're all the same nothing will
      * appear to have changed! This method only modifies tile indexes and does not change collision
      * information.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      */
    def shuffle(): DynamicTilemapLayer = js.native
    def shuffle(tileX: integer): DynamicTilemapLayer = js.native
    def shuffle(tileX: integer, tileY: integer): DynamicTilemapLayer = js.native
    def shuffle(tileX: integer, tileY: integer, width: integer): DynamicTilemapLayer = js.native
    def shuffle(tileX: integer, tileY: integer, width: integer, height: integer): DynamicTilemapLayer = js.native
    /**
      * Scans the given rectangular area (given in tile coordinates) for tiles with an index matching
      * `indexA` and swaps then with `indexB`. This only modifies the index and does not change collision
      * information.
      * @param tileA First tile index.
      * @param tileB Second tile index.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      */
    def swapByIndex(tileA: integer, tileB: integer): DynamicTilemapLayer = js.native
    def swapByIndex(tileA: integer, tileB: integer, tileX: integer): DynamicTilemapLayer = js.native
    def swapByIndex(tileA: integer, tileB: integer, tileX: integer, tileY: integer): DynamicTilemapLayer = js.native
    def swapByIndex(tileA: integer, tileB: integer, tileX: integer, tileY: integer, width: integer): DynamicTilemapLayer = js.native
    def swapByIndex(tileA: integer, tileB: integer, tileX: integer, tileY: integer, width: integer, height: integer): DynamicTilemapLayer = js.native
    /**
      * Converts from tile X coordinates (tile units) to world X coordinates (pixels), factoring in the
      * layers position, scale and scroll.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      */
    def tileToWorldX(tileX: integer): Double = js.native
    def tileToWorldX(tileX: integer, camera: Camera): Double = js.native
    /**
      * Converts from tile XY coordinates (tile units) to world XY coordinates (pixels), factoring in the
      * layers position, scale and scroll. This will return a new Vector2 object or update the given
      * `point` object.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param point A Vector2 to store the coordinates in. If not given a new Vector2 is created.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      */
    def tileToWorldXY(tileX: integer, tileY: integer): Vector2 = js.native
    def tileToWorldXY(tileX: integer, tileY: integer, point: Vector2): Vector2 = js.native
    def tileToWorldXY(tileX: integer, tileY: integer, point: Vector2, camera: Camera): Vector2 = js.native
    /**
      * Converts from tile Y coordinates (tile units) to world Y coordinates (pixels), factoring in the
      * layers position, scale and scroll.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      */
    def tileToWorldY(tileY: integer): Double = js.native
    def tileToWorldY(tileY: integer, camera: Camera): Double = js.native
    /**
      * Toggles the horizontal flipped state of this Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override def toggleFlipX(): this.type = js.native
    /**
      * Toggles the vertical flipped state of this Game Object.
      */
    /* CompleteClass */
    override def toggleFlipY(): this.type = js.native
    /**
      * Randomizes the indexes of a rectangular region of tiles (in tile coordinates) within the
      * specified layer. Each tile will receive a new index. New indexes are drawn from the given
      * weightedIndexes array. An example weighted array:
      * 
      * [
      *  { index: 6, weight: 4 },    // Probability of index 6 is 4 / 8
      *  { index: 7, weight: 2 },    // Probability of index 7 would be 2 / 8
      *  { index: 8, weight: 1.5 },  // Probability of index 8 would be 1.5 / 8
      *  { index: 26, weight: 0.5 }  // Probability of index 27 would be 0.5 / 8
      * ]
      * 
      * The probability of any index being choose is (the index's weight) / (sum of all weights). This
      * method only modifies tile indexes and does not change collision information.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param weightedIndexes An array of objects to randomly draw from during
      * randomization. They should be in the form: { index: 0, weight: 4 } or
      * { index: [0, 1], weight: 4 } if you wish to draw from multiple tile indexes.
      */
    def weightedRandomize(): DynamicTilemapLayer = js.native
    def weightedRandomize(tileX: integer): DynamicTilemapLayer = js.native
    def weightedRandomize(tileX: integer, tileY: integer): DynamicTilemapLayer = js.native
    def weightedRandomize(tileX: integer, tileY: integer, width: integer): DynamicTilemapLayer = js.native
    def weightedRandomize(tileX: integer, tileY: integer, width: integer, height: integer): DynamicTilemapLayer = js.native
    def weightedRandomize(
      tileX: integer,
      tileY: integer,
      width: integer,
      height: integer,
      weightedIndexes: js.Array[js.Object]
    ): DynamicTilemapLayer = js.native
    /**
      * Converts from world X coordinates (pixels) to tile X coordinates (tile units), factoring in the
      * layers position, scale and scroll.
      * @param worldX The x coordinate to be converted, in pixels, not tiles.
      * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer. Default true.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      */
    def worldToTileX(worldX: Double): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Boolean): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Camera): Double = js.native
    /**
      * Converts from world XY coordinates (pixels) to tile XY coordinates (tile units), factoring in the
      * layers position, scale and scroll. This will return a new Vector2 object or update the given
      * `point` object.
      * @param worldX The x coordinate to be converted, in pixels, not tiles.
      * @param worldY The y coordinate to be converted, in pixels, not tiles.
      * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer. Default true.
      * @param point A Vector2 to store the coordinates in. If not given a new Vector2 is created.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      */
    def worldToTileXY(worldX: Double, worldY: Double): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, point: Vector2): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, point: Vector2, camera: Camera): Vector2 = js.native
    /**
      * Converts from world Y coordinates (pixels) to tile Y coordinates (tile units), factoring in the
      * layers position, scale and scroll.
      * @param worldY The y coordinate to be converted, in pixels, not tiles.
      * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer. Default true.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      */
    def worldToTileY(worldY: Double): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Boolean): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Camera): Double = js.native
  }
  
  /**
    * An Image Collection is a special Tile Set containing multiple images, with no slicing into each image.
    * 
    * Image Collections are normally created automatically when Tiled data is loaded.
    */
  @js.native
  class ImageCollection protected () extends js.Object {
    /**
      * 
      * @param name The name of the image collection in the map data.
      * @param firstgid The first image index this image collection contains.
      * @param width Width of widest image (in pixels). Default 32.
      * @param height Height of tallest image (in pixels). Default 32.
      * @param margin The margin around all images in the collection (in pixels). Default 0.
      * @param spacing The spacing between each image in the collection (in pixels). Default 0.
      * @param properties Custom Image Collection properties. Default {}.
      */
    def this(name: String, firstgid: integer) = this()
    def this(name: String, firstgid: integer, width: integer) = this()
    def this(name: String, firstgid: integer, width: integer, height: integer) = this()
    def this(name: String, firstgid: integer, width: integer, height: integer, margin: integer) = this()
    def this(
      name: String,
      firstgid: integer,
      width: integer,
      height: integer,
      margin: integer,
      spacing: integer
    ) = this()
    def this(
      name: String,
      firstgid: integer,
      width: integer,
      height: integer,
      margin: integer,
      spacing: integer,
      properties: js.Object
    ) = this()
    /**
      * The Tiled firstgid value.
      * This is the starting index of the first image index this Image Collection contains.
      */
    var firstgid: integer = js.native
    /**
      * The height of the tallest image (in pixels).
      */
    val imageHeight: integer = js.native
    /**
      * The margin around the images in the collection (in pixels).
      * Use `setSpacing` to change.
      */
    val imageMarge: integer = js.native
    /**
      * The spacing between each image in the collection (in pixels).
      * Use `setSpacing` to change.
      */
    val imageSpacing: integer = js.native
    /**
      * The width of the widest image (in pixels).
      */
    val imageWidth: integer = js.native
    /**
      * The cached images that are a part of this collection.
      */
    val images: js.Array[_] = js.native
    /**
      * The name of the Image Collection.
      */
    var name: String = js.native
    /**
      * Image Collection-specific properties that are typically defined in the Tiled editor.
      */
    var properties: js.Object = js.native
    /**
      * The total number of images in the image collection.
      */
    val total: integer = js.native
    /**
      * Add an image to this Image Collection.
      * @param gid The gid of the image in the Image Collection.
      * @param image The the key of the image in the Image Collection and in the cache.
      */
    def addImage(gid: integer, image: String): ImageCollection = js.native
    /**
      * Returns true if and only if this image collection contains the given image index.
      * @param imageIndex The image index to search for.
      */
    def containsImageIndex(imageIndex: integer): Boolean = js.native
  }
  
  /**
    * A class for representing data about about a layer in a map. Maps are parsed from CSV, Tiled,
    * etc. into this format. Tilemap, StaticTilemapLayer and DynamicTilemapLayer have a reference
    * to this data and use it to look up and perform operations on tiles.
    */
  @js.native
  /**
    * 
    * @param config [description]
    */
  class LayerData () extends js.Object {
    def this(config: js.Object) = this()
    /**
      * [description]
      */
    var alpha: Double = js.native
    /**
      * [description]
      */
    var baseTileHeight: Double = js.native
    /**
      * [description]
      */
    var baseTileWidth: Double = js.native
    /**
      * [description]
      */
    var bodies: js.Array[_] = js.native
    /**
      * [description]
      */
    var callbacks: js.Array[_] = js.native
    /**
      * [description]
      */
    var collideIndexes: js.Array[_] = js.native
    /**
      * An array of the tile indexes
      */
    var data: js.Array[js.Array[Tile]] = js.native
    /**
      * The height in tiles of the layer.
      */
    var height: Double = js.native
    /**
      * The height in pixels of the entire layer.
      */
    var heightInPixels: Double = js.native
    /**
      * [description]
      */
    var indexes: js.Array[_] = js.native
    /**
      * The name of the layer, if specified in Tiled.
      */
    var name: String = js.native
    /**
      * Layer specific properties (can be specified in Tiled)
      */
    var properties: js.Object = js.native
    /**
      * The pixel height of the tiles.
      */
    var tileHeight: Double = js.native
    /**
      * The pixel width of the tiles.
      */
    var tileWidth: Double = js.native
    /**
      * [description]
      */
    var tilemapLayer: DynamicTilemapLayer | StaticTilemapLayer = js.native
    /**
      * [description]
      */
    var visible: Boolean = js.native
    /**
      * The width in tile of the layer.
      */
    var width: Double = js.native
    /**
      * The width in pixels of the entire layer.
      */
    var widthInPixels: Double = js.native
    /**
      * The x offset of where to draw from the top left
      */
    var x: Double = js.native
    /**
      * The y offset of where to draw from the top left
      */
    var y: Double = js.native
  }
  
  /**
    * A class for representing data about a map. Maps are parsed from CSV, Tiled, etc. into this
    * format. A Tilemap object get a copy of this data and then unpacks the needed properties into
    * itself.
    */
  @js.native
  /**
    * 
    * @param config The Map configuration object.
    */
  class MapData () extends js.Object {
    def this(config: MapDataConfig) = this()
    /**
      * An object of collision data. Must be created as physics object or will return undefined.
      */
    var collision: js.Object = js.native
    /**
      * [description]
      */
    var format: integer = js.native
    /**
      * The height of the entire tilemap.
      */
    var height: Double = js.native
    /**
      * The height in pixels of the entire tilemap.
      */
    var heightInPixels: Double = js.native
    /**
      * The collection of images the map uses(specified in Tiled)
      */
    var imageCollections: js.Array[_] = js.native
    /**
      * An array of Tiled Image Layers.
      */
    var images: js.Array[_] = js.native
    /**
      * If the map is infinite or not.
      */
    var infinite: Boolean = js.native
    /**
      * An array with all the layers configured to the MapData.
      */
    var layers: js.Array[LayerData] | ObjectLayer = js.native
    /**
      * The key in the Phaser cache that corresponds to the loaded tilemap data.
      */
    var name: String = js.native
    /**
      * An object of Tiled Object Layers.
      */
    var objects: js.Object = js.native
    /**
      * The orientation of the map data (i.e. orthogonal, isometric, hexagonal), default 'orthogonal'.
      */
    var orientation: String = js.native
    /**
      * Map specific properties (can be specified in Tiled)
      */
    var properties: js.Object = js.native
    /**
      * Determines the draw order of tilemap. Default is right-down
      * 
      * 0, or 'right-down'
      * 1, or 'left-down'
      * 2, or 'right-up'
      * 3, or 'left-up'
      */
    var renderOrder: String = js.native
    /**
      * The height of the tiles.
      */
    var tileHeight: Double = js.native
    /**
      * The width of the tiles.
      */
    var tileWidth: Double = js.native
    /**
      * [description]
      */
    var tiles: js.Array[_] = js.native
    /**
      * An array of Tilesets.
      */
    var tilesets: js.Array[Tileset] = js.native
    /**
      * The version of the map data (as specified in Tiled).
      */
    var version: String = js.native
    /**
      * The width of the entire tilemap.
      */
    var width: Double = js.native
    /**
      * The width in pixels of the entire tilemap.
      */
    var widthInPixels: Double = js.native
  }
  
  /**
    * A class for representing a Tiled object layer in a map. This mirrors the structure of a Tiled
    * object layer, except:
    *  - "x" & "y" properties are ignored since these cannot be changed in Tiled.
    *  - "offsetx" & "offsety" are applied to the individual object coordinates directly, so they
    *    are ignored as well.
    *  - "draworder" is ignored.
    */
  @js.native
  /**
    * 
    * @param config The data for the layer from the Tiled JSON object.
    */
  class ObjectLayer () extends js.Object {
    def this(config: ObjectLayerConfig) = this()
    /**
      * The name of the Object Layer.
      */
    var name: String = js.native
    /**
      * An array of all objects on this Object Layer.
      * 
      * Each Tiled object corresponds to a JavaScript object in this array. It has an `id` (unique),
      * `name` (as assigned in Tiled), `type` (as assigned in Tiled), `rotation` (in clockwise degrees),
      * `properties` (if any), `visible` state (`true` if visible, `false` otherwise),
      * `x` and `y` coordinates (in pixels, relative to the tilemap), and a `width` and `height` (in pixels).
      * 
      * An object tile has a `gid` property (GID of the represented tile), a `flippedHorizontal` property,
      * a `flippedVertical` property, and `flippedAntiDiagonal` property.
      * The {@link http://docs.mapeditor.org/en/latest/reference/tmx-map-format/|Tiled documentation} contains
      * information on flipping and rotation.
      * 
      * Polylines have a `polyline` property, which is an array of objects corresponding to points,
      * where each point has an `x` property and a `y` property. Polygons have an identically structured
      * array in their `polygon` property. Text objects have a `text` property with the text's properties.
      * 
      * Rectangles and ellipses have a `rectangle` or `ellipse` property set to `true`.
      */
    var objects: js.Array[TiledObject] = js.native
    /**
      * The opacity of the layer, between 0 and 1.
      */
    var opacity: Double = js.native
    /**
      * The custom properties defined on the Object Layer, keyed by their name.
      */
    var properties: js.Object = js.native
    /**
      * The type of each custom property defined on the Object Layer, keyed by its name.
      */
    var propertyTypes: js.Object = js.native
    /**
      * The type of the layer, which should be `objectgroup`.
      */
    var `type`: String = js.native
    /**
      * Whether the layer is shown (`true`) or hidden (`false`).
      */
    var visible: Boolean = js.native
  }
  
  /**
    * A Static Tilemap Layer is a Game Object that renders LayerData from a Tilemap when used in combination
    * with one, or more, Tilesets.
    * 
    * A Static Tilemap Layer is optimized for rendering speed over flexibility. You cannot apply per-tile
    * effects like tint or alpha, or change the tiles or tilesets the layer uses.
    * 
    * Use a Static Tilemap Layer instead of a Dynamic Tilemap Layer when you don't need tile manipulation features.
    */
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typingsJapgolly.phaser.Phaser.Types.Physics.Arcade._ArcadeColliderType because Already inherited */ @js.native
  class StaticTilemapLayer protected ()
    extends GameObject
       with Alpha
       with BlendMode
       with ComputedSize
       with Depth
       with Flip
       with GetBounds
       with Origin
       with Pipeline
       with Transform
       with Visible
       with ScrollFactor {
    /**
      * 
      * @param scene The Scene to which this Game Object belongs.
      * @param tilemap The Tilemap this layer is a part of.
      * @param layerIndex The index of the LayerData associated with this layer.
      * @param tileset The tileset, or an array of tilesets, used to render this layer. Can be a string or a Tileset object.
      * @param x The world x position where the top left of this layer will be placed. Default 0.
      * @param y The world y position where the top left of this layer will be placed. Default 0.
      */
    def this(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: String) = this()
    def this(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: js.Array[String | Tileset]) = this()
    def this(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: Tileset) = this()
    def this(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: String, x: Double) = this()
    def this(
      scene: Scene,
      tilemap: Tilemap,
      layerIndex: integer,
      tileset: js.Array[String | Tileset],
      x: Double
    ) = this()
    def this(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: Tileset, x: Double) = this()
    def this(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: String, x: Double, y: Double) = this()
    def this(
      scene: Scene,
      tilemap: Tilemap,
      layerIndex: integer,
      tileset: js.Array[String | Tileset],
      x: Double,
      y: Double
    ) = this()
    def this(scene: Scene, tilemap: Tilemap, layerIndex: integer, tileset: Tileset, x: Double, y: Double) = this()
    /**
      * Canvas only.
      * 
      * The callback that is invoked when the tiles are culled.
      * 
      * By default it will call `TilemapComponents.CullTiles` but you can override this to call any function you like.
      * 
      * It will be sent 3 arguments:
      * 
      * 1. The Phaser.Tilemaps.LayerData object for this Layer
      * 2. The Camera that is culling the layer. You can check its `dirty` property to see if it has changed since the last cull.
      * 3. A reference to the `culledTiles` array, which should be used to store the tiles you want rendered.
      * 
      * See the `TilemapComponents.CullTiles` source code for details on implementing your own culling system.
      */
    var cullCallback: js.Function = js.native
    /**
      * Canvas only.
      * 
      * The amount of extra tiles to add into the cull rectangle when calculating its horizontal size.
      * 
      * See the method `setCullPadding` for more details.
      */
    var cullPaddingX: integer = js.native
    /**
      * Canvas only.
      * 
      * The amount of extra tiles to add into the cull rectangle when calculating its vertical size.
      * 
      * See the method `setCullPadding` for more details.
      */
    var cullPaddingY: integer = js.native
    /**
      * Used internally by the Canvas renderer.
      * This holds the tiles that are visible within the camera in the last frame.
      */
    var culledTiles: js.Array[_] = js.native
    /**
      * The depth of this Game Object within the Scene.
      * 
      * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
      * of Game Objects, without actually moving their position in the display list.
      * 
      * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
      * value will always render in front of one with a lower value.
      * 
      * Setting the depth will queue a depth sort event within the Scene.
      */
    /* CompleteClass */
    override var depth: Double = js.native
    /**
      * The displayed height of this Game Object.
      * 
      * This value takes into account the scale factor.
      * 
      * Setting this value will adjust the Game Object's scale property.
      */
    /* CompleteClass */
    override var displayHeight: Double = js.native
    /**
      * The displayed width of this Game Object.
      * 
      * This value takes into account the scale factor.
      * 
      * Setting this value will adjust the Game Object's scale property.
      */
    /* CompleteClass */
    override var displayWidth: Double = js.native
    /**
      * The horizontally flipped state of the Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override var flipX: Boolean = js.native
    /**
      * The vertically flipped state of the Game Object.
      * 
      * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override var flipY: Boolean = js.native
    /**
      * An array holding the mapping between the tile indexes and the tileset they belong to.
      */
    var gidMap: js.Array[Tileset] = js.native
    /**
      * The native (un-scaled) height of this Game Object.
      * 
      * Changing this value will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or use
      * the `displayHeight` property.
      */
    /* CompleteClass */
    override var height: Double = js.native
    /**
      * Used internally by physics system to perform fast type checks.
      */
    val isTilemap: Boolean = js.native
    /**
      * The LayerData associated with this layer. LayerData can only be associated with one
      * tilemap layer.
      */
    var layer: LayerData = js.native
    /**
      * The index of the LayerData associated with this layer.
      */
    var layerIndex: integer = js.native
    /**
      * Canvas only.
      * 
      * You can control if the Cameras should cull tiles before rendering them or not.
      * By default the camera will try to cull the tiles in this layer, to avoid over-drawing to the renderer.
      * 
      * However, there are some instances when you may wish to disable this, and toggling this flag allows
      * you to do so. Also see `setSkipCull` for a chainable method that does the same thing.
      */
    var skipCull: Boolean = js.native
    /**
      * The Tilemap that this layer is a part of.
      */
    var tilemap: Tilemap = js.native
    /**
      * Canvas only.
      * 
      * The total number of tiles drawn by the renderer in the last frame.
      * 
      * This only works when rending with Canvas.
      */
    val tilesDrawn: integer = js.native
    /**
      * Canvas only.
      * 
      * The total number of tiles in this layer. Updated every frame.
      */
    val tilesTotal: integer = js.native
    /**
      * The Tileset/s associated with this layer.
      * 
      * As of Phaser 3.14 this property is now an array of Tileset objects, previously it was a single reference.
      */
    var tileset: js.Array[Tileset] = js.native
    /**
      * The visible state of the Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      */
    /* CompleteClass */
    override var visible: Boolean = js.native
    /**
      * The native (un-scaled) width of this Game Object.
      * 
      * Changing this value will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or use
      * the `displayWidth` property.
      */
    /* CompleteClass */
    override var width: Double = js.native
    /**
      * Calculates interesting faces at the given tile coordinates of the specified layer. Interesting
      * faces are used internally for optimizing collisions against tiles. This method is mostly used
      * internally to optimize recalculating faces when only one tile has been changed.
      * @param tileX The x coordinate.
      * @param tileY The y coordinate.
      */
    def calculateFacesAt(tileX: integer, tileY: integer): StaticTilemapLayer = js.native
    /**
      * Calculates interesting faces within the rectangular area specified (in tile coordinates) of the
      * layer. Interesting faces are used internally for optimizing collisions against tiles. This method
      * is mostly used internally.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      */
    def calculateFacesWithin(): StaticTilemapLayer = js.native
    def calculateFacesWithin(tileX: integer): StaticTilemapLayer = js.native
    def calculateFacesWithin(tileX: integer, tileY: integer): StaticTilemapLayer = js.native
    def calculateFacesWithin(tileX: integer, tileY: integer, width: integer): StaticTilemapLayer = js.native
    def calculateFacesWithin(tileX: integer, tileY: integer, width: integer, height: integer): StaticTilemapLayer = js.native
    def createFromTiles(indexes: js.Array[_], replacements: js.Array[_], spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
    def createFromTiles(indexes: js.Array[_], replacements: js.Array[_], spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: js.Array[_],
      replacements: js.Array[_],
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera
    ): js.Array[Sprite] = js.native
    def createFromTiles(indexes: js.Array[_], replacements: integer, spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
    def createFromTiles(indexes: js.Array[_], replacements: integer, spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: js.Array[_],
      replacements: integer,
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera
    ): js.Array[Sprite] = js.native
    def createFromTiles(indexes: integer, replacements: js.Array[_], spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
    def createFromTiles(indexes: integer, replacements: js.Array[_], spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: integer,
      replacements: js.Array[_],
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera
    ): js.Array[Sprite] = js.native
    /**
      * Creates a Sprite for every object matching the given tile indexes in the layer. You can
      * optionally specify if each tile will be replaced with a new tile after the Sprite has been
      * created. This is useful if you want to lay down special tiles in a level that are converted to
      * Sprites, but want to replace the tile itself with a floor tile or similar once converted.
      * @param indexes The tile index, or array of indexes, to create Sprites from.
      * @param replacements The tile index, or array of indexes, to change a converted
      * tile to. Set to `null` to leave the tiles unchanged. If an array is given, it is assumed to be a
      * one-to-one mapping with the indexes array.
      * @param spriteConfig The config object to pass into the Sprite creator (i.e.
      * scene.make.sprite).
      * @param scene The Scene to create the Sprites within. Default scene the map is within.
      * @param camera The Camera to use when determining the world XY Default main camera.
      */
    def createFromTiles(indexes: integer, replacements: integer, spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
    def createFromTiles(indexes: integer, replacements: integer, spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(indexes: integer, replacements: integer, spriteConfig: SpriteConfig, scene: Scene, camera: Camera): js.Array[Sprite] = js.native
    /**
      * Returns the tiles in the given layer that are within the cameras viewport.
      * This is used internally.
      * @param camera The Camera to run the cull check against.
      */
    def cull(): js.Array[Tile] = js.native
    def cull(camera: Camera): js.Array[Tile] = js.native
    /**
      * For each tile in the given rectangular area (in tile coordinates) of the layer, run the given
      * filter callback function. Any tiles that pass the filter test (i.e. where the callback returns
      * true) will returned as a new array. Similar to Array.prototype.Filter in vanilla JS.
      * @param callback The callback. Each tile in the given area will be passed to this
      * callback as the first and only parameter. The callback should return true for tiles that pass the
      * filter.
      * @param context The context under which the callback should be run.
      * @param tileX The leftmost tile index (in tile coordinates) to use as the origin of the area to filter. Default 0.
      * @param tileY The topmost tile index (in tile coordinates) to use as the origin of the area to filter. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      */
    def filterTiles(
      callback: js.Function,
      context: js.UndefOr[js.Object],
      tileX: js.UndefOr[integer],
      tileY: js.UndefOr[integer],
      width: js.UndefOr[integer],
      height: js.UndefOr[integer],
      filteringOptions: js.UndefOr[FilteringOptions]
    ): js.Array[Tile] = js.native
    /**
      * Searches the entire map layer for the first tile matching the given index, then returns that Tile
      * object. If no match is found, it returns null. The search starts from the top-left tile and
      * continues horizontally until it hits the end of the row, then it drops down to the next column.
      * If the reverse boolean is true, it scans starting from the bottom-right corner traveling up to
      * the top-left.
      * @param index The tile index value to search for.
      * @param skip The number of times to skip a matching tile before returning. Default 0.
      * @param reverse If true it will scan the layer in reverse, starting at the
      * bottom-right. Otherwise it scans from the top-left. Default false.
      */
    def findByIndex(index: integer): Tile = js.native
    def findByIndex(index: integer, skip: integer): Tile = js.native
    def findByIndex(index: integer, skip: integer, reverse: Boolean): Tile = js.native
    /**
      * Find the first tile in the given rectangular area (in tile coordinates) of the layer that
      * satisfies the provided testing function. I.e. finds the first tile for which `callback` returns
      * true. Similar to Array.prototype.find in vanilla JS.
      * @param callback The callback. Each tile in the given area will be passed to this
      * callback as the first and only parameter.
      * @param context The context under which the callback should be run.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area to filter. Default 0.
      * @param tileY The topmost tile index (in tile coordinates) to use as the origin of the area to filter. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      */
    def findTile(
      callback: js.Function,
      context: js.UndefOr[js.Object],
      tileX: js.UndefOr[integer],
      tileY: js.UndefOr[integer],
      width: js.UndefOr[integer],
      height: js.UndefOr[integer],
      filteringOptions: js.UndefOr[FilteringOptions]
    ): Tile = js.native
    /**
      * For each tile in the given rectangular area (in tile coordinates) of the layer, run the given
      * callback. Similar to Array.prototype.forEach in vanilla JS.
      * @param callback The callback. Each tile in the given area will be passed to this
      * callback as the first and only parameter.
      * @param context The context under which the callback should be run.
      * @param tileX The leftmost tile index (in tile coordinates) to use as the origin of the area to filter. Default 0.
      * @param tileY The topmost tile index (in tile coordinates) to use as the origin of the area to filter. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      */
    def forEachTile(
      callback: js.Function,
      context: js.UndefOr[js.Object],
      tileX: js.UndefOr[integer],
      tileY: js.UndefOr[integer],
      width: js.UndefOr[integer],
      height: js.UndefOr[integer],
      filteringOptions: js.UndefOr[FilteringOptions]
    ): StaticTilemapLayer = js.native
    /**
      * Gets a tile at the given tile coordinates from the given layer.
      * @param tileX X position to get the tile from (given in tile units, not pixels).
      * @param tileY Y position to get the tile from (given in tile units, not pixels).
      * @param nonNull If true getTile won't return null for empty tiles, but a Tile
      * object with an index of -1. Default false.
      */
    def getTileAt(tileX: integer, tileY: integer): Tile = js.native
    def getTileAt(tileX: integer, tileY: integer, nonNull: Boolean): Tile = js.native
    /**
      * Gets a tile at the given world coordinates from the given layer.
      * @param worldX X position to get the tile from (given in pixels)
      * @param worldY Y position to get the tile from (given in pixels)
      * @param nonNull If true, function won't return null for empty tiles, but a Tile
      * object with an index of -1. Default false.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      */
    def getTileAtWorldXY(worldX: Double, worldY: Double): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Camera): Tile = js.native
    /**
      * Gets the tiles in the given rectangular area (in tile coordinates) of the layer.
      * @param tileX The leftmost tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param tileY The topmost tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      */
    def getTilesWithin(): js.Array[Tile] = js.native
    def getTilesWithin(tileX: integer): js.Array[Tile] = js.native
    def getTilesWithin(tileX: integer, tileY: integer): js.Array[Tile] = js.native
    def getTilesWithin(tileX: integer, tileY: integer, width: integer): js.Array[Tile] = js.native
    def getTilesWithin(tileX: integer, tileY: integer, width: integer, height: integer): js.Array[Tile] = js.native
    def getTilesWithin(
      tileX: integer,
      tileY: integer,
      width: integer,
      height: integer,
      filteringOptions: FilteringOptions
    ): js.Array[Tile] = js.native
    /**
      * Gets the tiles that overlap with the given shape in the given layer. The shape must be a Circle,
      * Line, Rectangle or Triangle. The shape should be in world coordinates.
      * @param shape A shape in world (pixel) coordinates
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      */
    def getTilesWithinShape(shape: Circle): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Circle, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Circle, filteringOptions: FilteringOptions, camera: Camera): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Line): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Line, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Line, filteringOptions: FilteringOptions, camera: Camera): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Rectangle): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Rectangle, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Rectangle, filteringOptions: FilteringOptions, camera: Camera): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Triangle): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Triangle, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Triangle, filteringOptions: FilteringOptions, camera: Camera): js.Array[Tile] = js.native
    /**
      * Gets the tiles in the given rectangular area (in world coordinates) of the layer.
      * @param worldX The leftmost tile index (in tile coordinates) to use as the origin of the area to filter.
      * @param worldY The topmost tile index (in tile coordinates) to use as the origin of the area to filter.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles high from the `tileY` index the area will be.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param camera The Camera to use when factoring in which tiles to return. Default main camera.
      */
    def getTilesWithinWorldXY(worldX: Double, worldY: Double, width: Double, height: Double): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(worldX: Double, worldY: Double, width: Double, height: Double, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(
      worldX: Double,
      worldY: Double,
      width: Double,
      height: Double,
      filteringOptions: FilteringOptions,
      camera: Camera
    ): js.Array[Tile] = js.native
    /**
      * Checks if there is a tile at the given location (in tile coordinates) in the given layer. Returns
      * false if there is no tile or if the tile at that location has an index of -1.
      * @param tileX X position to get the tile from in tile coordinates.
      * @param tileY Y position to get the tile from in tile coordinates.
      */
    def hasTileAt(tileX: integer, tileY: integer): Boolean = js.native
    /**
      * Checks if there is a tile at the given location (in world coordinates) in the given layer. Returns
      * false if there is no tile or if the tile at that location has an index of -1.
      * @param worldX The X coordinate of the world position.
      * @param worldY The Y coordinate of the world position.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      */
    def hasTileAtWorldXY(worldX: Double, worldY: Double): Boolean = js.native
    def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Camera): Boolean = js.native
    /**
      * Draws a debug representation of the layer to the given Graphics. This is helpful when you want to
      * get a quick idea of which of your tiles are colliding and which have interesting faces. The tiles
      * are drawn starting at (0, 0) in the Graphics, allowing you to place the debug representation
      * wherever you want on the screen.
      * @param graphics The target Graphics object to draw upon.
      * @param styleConfig An object specifying the colors to use for the debug drawing.
      */
    def renderDebug(graphics: Graphics, styleConfig: StyleConfig): StaticTilemapLayer = js.native
    /**
      * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
      */
    /* CompleteClass */
    override def resetFlip(): this.type = js.native
    def setCollision(indexes: js.Array[_]): StaticTilemapLayer = js.native
    def setCollision(indexes: js.Array[_], collides: Boolean): StaticTilemapLayer = js.native
    def setCollision(indexes: js.Array[_], collides: Boolean, recalculateFaces: Boolean): StaticTilemapLayer = js.native
    def setCollision(indexes: js.Array[_], collides: Boolean, recalculateFaces: Boolean, updateLayer: Boolean): StaticTilemapLayer = js.native
    /**
      * Sets collision on the given tile or tiles within a layer by index. You can pass in either a
      * single numeric index or an array of indexes: [2, 3, 15, 20]. The `collides` parameter controls if
      * collision will be enabled (true) or disabled (false).
      * @param indexes Either a single tile index, or an array of tile indexes.
      * @param collides If true it will enable collision. If false it will clear
      * collision. Default true.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the
      * update. Default true.
      * @param updateLayer If true, updates the current tiles on the layer. Set to
      * false if no tiles have been placed for significant performance boost. Default true.
      */
    def setCollision(indexes: integer): StaticTilemapLayer = js.native
    def setCollision(indexes: integer, collides: Boolean): StaticTilemapLayer = js.native
    def setCollision(indexes: integer, collides: Boolean, recalculateFaces: Boolean): StaticTilemapLayer = js.native
    def setCollision(indexes: integer, collides: Boolean, recalculateFaces: Boolean, updateLayer: Boolean): StaticTilemapLayer = js.native
    /**
      * Sets collision on a range of tiles in a layer whose index is between the specified `start` and
      * `stop` (inclusive). Calling this with a start value of 10 and a stop value of 14 would set
      * collision for tiles 10, 11, 12, 13 and 14. The `collides` parameter controls if collision will be
      * enabled (true) or disabled (false).
      * @param start The first index of the tile to be set for collision.
      * @param stop The last index of the tile to be set for collision.
      * @param collides If true it will enable collision. If false it will clear
      * collision. Default true.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the
      * update. Default true.
      */
    def setCollisionBetween(start: integer, stop: integer): StaticTilemapLayer = js.native
    def setCollisionBetween(start: integer, stop: integer, collides: Boolean): StaticTilemapLayer = js.native
    def setCollisionBetween(start: integer, stop: integer, collides: Boolean, recalculateFaces: Boolean): StaticTilemapLayer = js.native
    /**
      * Sets collision on all tiles in the given layer, except for tiles that have an index specified in
      * the given array. The `collides` parameter controls if collision will be enabled (true) or
      * disabled (false).
      * @param indexes An array of the tile indexes to not be counted for collision.
      * @param collides If true it will enable collision. If false it will clear
      * collision. Default true.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the
      * update. Default true.
      */
    def setCollisionByExclusion(indexes: js.Array[integer]): StaticTilemapLayer = js.native
    def setCollisionByExclusion(indexes: js.Array[integer], collides: Boolean): StaticTilemapLayer = js.native
    def setCollisionByExclusion(indexes: js.Array[integer], collides: Boolean, recalculateFaces: Boolean): StaticTilemapLayer = js.native
    /**
      * Sets collision on the tiles within a layer by checking tile properties. If a tile has a property
      * that matches the given properties object, its collision flag will be set. The `collides`
      * parameter controls if collision will be enabled (true) or disabled (false). Passing in
      * `{ collides: true }` would update the collision flag on any tiles with a "collides" property that
      * has a value of true. Any tile that doesn't have "collides" set to true will be ignored. You can
      * also use an array of values, e.g. `{ types: ["stone", "lava", "sand" ] }`. If a tile has a
      * "types" property that matches any of those values, its collision flag will be updated.
      * @param properties An object with tile properties and corresponding values that should
      * be checked.
      * @param collides If true it will enable collision. If false it will clear
      * collision. Default true.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the
      * update. Default true.
      */
    def setCollisionByProperty(properties: js.Object): StaticTilemapLayer = js.native
    def setCollisionByProperty(properties: js.Object, collides: Boolean): StaticTilemapLayer = js.native
    def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Boolean): StaticTilemapLayer = js.native
    /**
      * Sets collision on the tiles within a layer by checking each tiles collision group data
      * (typically defined in Tiled within the tileset collision editor). If any objects are found within
      * a tiles collision group, the tile's colliding information will be set. The `collides` parameter
      * controls if collision will be enabled (true) or disabled (false).
      * @param collides If true it will enable collision. If false it will clear
      * collision. Default true.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the
      * update. Default true.
      */
    def setCollisionFromCollisionGroup(): StaticTilemapLayer = js.native
    def setCollisionFromCollisionGroup(collides: Boolean): StaticTilemapLayer = js.native
    def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Boolean): StaticTilemapLayer = js.native
    /**
      * Canvas only.
      * 
      * When a Camera culls the tiles in this layer it does so using its view into the world, building up a
      * rectangle inside which the tiles must exist or they will be culled. Sometimes you may need to expand the size
      * of this 'cull rectangle', especially if you plan on rotating the Camera viewing the layer. Do so
      * by providing the padding values. The values given are in tiles, not pixels. So if the tile width was 32px
      * and you set `paddingX` to be 4, it would add 32px x 4 to the cull rectangle (adjusted for scale)
      * @param paddingX The amount of extra horizontal tiles to add to the cull check padding. Default 1.
      * @param paddingY The amount of extra vertical tiles to add to the cull check padding. Default 1.
      */
    def setCullPadding(): this.type = js.native
    def setCullPadding(paddingX: integer): this.type = js.native
    def setCullPadding(paddingX: integer, paddingY: integer): this.type = js.native
    /**
      * The depth of this Game Object within the Scene.
      * 
      * The depth is also known as the 'z-index' in some environments, and allows you to change the rendering order
      * of Game Objects, without actually moving their position in the display list.
      * 
      * The depth starts from zero (the default value) and increases from that point. A Game Object with a higher depth
      * value will always render in front of one with a lower value.
      * 
      * Setting the depth will queue a depth sort event within the Scene.
      * @param value The depth of this Game Object.
      */
    /* CompleteClass */
    override def setDepth(value: integer): this.type = js.native
    /**
      * Sets the display size of this Game Object.
      * 
      * Calling this will adjust the scale.
      * @param width The width of this Game Object.
      * @param height The height of this Game Object.
      */
    /* CompleteClass */
    override def setDisplaySize(width: Double, height: Double): this.type = js.native
    /**
      * Sets the horizontal and vertical flipped state of this Game Object.
      * 
      * A Game Object that is flipped will render inversed on the flipped axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
      * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlip(x: Boolean, y: Boolean): this.type = js.native
    /**
      * Sets the horizontal flipped state of this Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      * @param value The flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlipX(value: Boolean): this.type = js.native
    /**
      * Sets the vertical flipped state of this Game Object.
      * @param value The flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlipY(value: Boolean): this.type = js.native
    def setRenderOrder(renderOrder: String): this.type = js.native
    /**
      * Sets the rendering (draw) order of the tiles in this layer.
      * 
      * The default is 'right-down', meaning it will order the tiles starting from the top-left,
      * drawing to the right and then moving down to the next row.
      * 
      * The draw orders are:
      * 
      * 0 = right-down
      * 1 = left-down
      * 2 = right-up
      * 3 = left-up
      * 
      * Setting the render order does not change the tiles or how they are stored in the layer,
      * it purely impacts the order in which they are rendered.
      * 
      * You can provide either an integer (0 to 3), or the string version of the order.
      * @param renderOrder The render (draw) order value. Either an integer between 0 and 3, or a string: 'right-down', 'left-down', 'right-up' or 'left-up'.
      */
    def setRenderOrder(renderOrder: integer): this.type = js.native
    /**
      * Sets the internal size of this Game Object, as used for frame or physics body creation.
      * 
      * This will not change the size that the Game Object is rendered in-game.
      * For that you need to either set the scale of the Game Object (`setScale`) or call the
      * `setDisplaySize` method, which is the same thing as changing the scale but allows you
      * to do so by giving pixel values.
      * 
      * If you have enabled this Game Object for input, changing the size will _not_ change the
      * size of the hit area. To do this you should adjust the `input.hitArea` object directly.
      * @param width The width of this Game Object.
      * @param height The height of this Game Object.
      */
    /* CompleteClass */
    override def setSize(width: Double, height: Double): this.type = js.native
    /**
      * Canvas only.
      * 
      * You can control if the Cameras should cull tiles before rendering them or not.
      * By default the camera will try to cull the tiles in this layer, to avoid over-drawing to the renderer.
      * 
      * However, there are some instances when you may wish to disable this.
      * @param value Set to `true` to stop culling tiles. Set to `false` to enable culling again. Default true.
      */
    def setSkipCull(): this.type = js.native
    def setSkipCull(value: Boolean): this.type = js.native
    def setTileIndexCallback(indexes: js.Array[_], callback: js.Function, callbackContext: js.Object): StaticTilemapLayer = js.native
    /**
      * Sets a global collision callback for the given tile index within the layer. This will affect all
      * tiles on this layer that have the same index. If a callback is already set for the tile index it
      * will be replaced. Set the callback to null to remove it. If you want to set a callback for a tile
      * at a specific location on the map then see setTileLocationCallback.
      * @param indexes Either a single tile index, or an array of tile indexes to have a
      * collision callback set for.
      * @param callback The callback that will be invoked when the tile is collided with.
      * @param callbackContext The context under which the callback is called.
      */
    def setTileIndexCallback(indexes: integer, callback: js.Function, callbackContext: js.Object): StaticTilemapLayer = js.native
    /**
      * Sets a collision callback for the given rectangular area (in tile coordinates) within the layer.
      * If a callback is already set for the tile index it will be replaced. Set the callback to null to
      * remove it.
      * @param tileX The leftmost tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The topmost tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param callback The callback that will be invoked when the tile is collided with.
      * @param callbackContext The context under which the callback is called.
      */
    def setTileLocationCallback(tileX: integer, tileY: integer, width: integer, height: integer, callback: js.Function): StaticTilemapLayer = js.native
    def setTileLocationCallback(
      tileX: integer,
      tileY: integer,
      width: integer,
      height: integer,
      callback: js.Function,
      callbackContext: js.Object
    ): StaticTilemapLayer = js.native
    /**
      * Sets the visibility of this Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      * @param value The visible state of the Game Object.
      */
    /* CompleteClass */
    override def setVisible(value: Boolean): this.type = js.native
    /**
      * Converts from tile X coordinates (tile units) to world X coordinates (pixels), factoring in the
      * layers position, scale and scroll.
      * @param tileX The X coordinate, in tile coordinates.
      * @param camera The Camera to use when calculating the world values from the tile index. Default main camera.
      */
    def tileToWorldX(tileX: integer): Double = js.native
    def tileToWorldX(tileX: integer, camera: Camera): Double = js.native
    /**
      * Converts from tile XY coordinates (tile units) to world XY coordinates (pixels), factoring in the
      * layers position, scale and scroll. This will return a new Vector2 object or update the given
      * `point` object.
      * @param tileX The X coordinate, in tile coordinates.
      * @param tileY The Y coordinate, in tile coordinates.
      * @param point A Vector2 to store the coordinates in. If not given, a new Vector2 is created.
      * @param camera The Camera to use when calculating the world values from the tile index. Default main camera.
      */
    def tileToWorldXY(tileX: integer, tileY: integer): Vector2 = js.native
    def tileToWorldXY(tileX: integer, tileY: integer, point: Vector2): Vector2 = js.native
    def tileToWorldXY(tileX: integer, tileY: integer, point: Vector2, camera: Camera): Vector2 = js.native
    /**
      * Converts from tile Y coordinates (tile units) to world Y coordinates (pixels), factoring in the
      * layers position, scale and scroll.
      * @param tileY The Y coordinate, in tile coordinates.
      * @param camera The Camera to use when calculating the world values from the tile index. Default main camera.
      */
    def tileToWorldY(tileY: integer): Double = js.native
    def tileToWorldY(tileY: integer, camera: Camera): Double = js.native
    /**
      * Toggles the horizontal flipped state of this Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override def toggleFlipX(): this.type = js.native
    /**
      * Toggles the vertical flipped state of this Game Object.
      */
    /* CompleteClass */
    override def toggleFlipY(): this.type = js.native
    /**
      * Upload the tile data to a VBO.
      * @param camera The camera to render to.
      * @param tilesetIndex The tileset index.
      */
    def upload(camera: Camera, tilesetIndex: integer): StaticTilemapLayer = js.native
    /**
      * Converts from world X coordinates (pixels) to tile X coordinates (tile units), factoring in the
      * layers position, scale and scroll.
      * @param worldX The X coordinate, in world pixels.
      * @param snapToFloor Whether or not to round the tile coordinate down to the
      * nearest integer. Default true.
      * @param camera The Camera to use when calculating the tile index from the world values.] Default main camera.
      */
    def worldToTileX(worldX: Double): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Boolean): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Camera): Double = js.native
    /**
      * Converts from world XY coordinates (pixels) to tile XY coordinates (tile units), factoring in the
      * layers position, scale and scroll. This will return a new Vector2 object or update the given
      * `point` object.
      * @param worldX The X coordinate, in world pixels.
      * @param worldY The Y coordinate, in world pixels.
      * @param snapToFloor Whether or not to round the tile coordinate down to the
      * nearest integer. Default true.
      * @param point A Vector2 to store the coordinates in. If not given, a new Vector2 is created.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      */
    def worldToTileXY(worldX: Double, worldY: Double): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, point: Vector2): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, point: Vector2, camera: Camera): Vector2 = js.native
    /**
      * Converts from world Y coordinates (pixels) to tile Y coordinates (tile units), factoring in the
      * layers position, scale and scroll.
      * @param worldY The Y coordinate, in world pixels.
      * @param snapToFloor Whether or not to round the tile coordinate down to the
      * nearest integer. Default true.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      */
    def worldToTileY(worldY: Double): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Boolean): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Camera): Double = js.native
  }
  
  /**
    * A Tile is a representation of a single tile within the Tilemap. This is a lightweight data
    * representation, so its position information is stored without factoring in scroll, layer
    * scale or layer position.
    */
  @js.native
  class Tile protected ()
    extends Alpha
       with Flip
       with Visible {
    /**
      * 
      * @param layer The LayerData object in the Tilemap that this tile belongs to.
      * @param index The unique index of this tile within the map.
      * @param x The x coordinate of this tile in tile coordinates.
      * @param y The y coordinate of this tile in tile coordinates.
      * @param width Width of the tile in pixels.
      * @param height Height of the tile in pixels.
      * @param baseWidth The base width a tile in the map (in pixels). Tiled maps support
      * multiple tileset sizes within one map, but they are still placed at intervals of the base
      * tile width.
      * @param baseHeight The base height of the tile in pixels (in pixels). Tiled maps
      * support multiple tileset sizes within one map, but they are still placed at intervals of the
      * base tile height.
      */
    def this(
      layer: LayerData,
      index: integer,
      x: integer,
      y: integer,
      width: integer,
      height: integer,
      baseWidth: integer,
      baseHeight: integer
    ) = this()
    /**
      * The map's base height of a tile in pixels. Tiled maps support multiple tileset sizes
      * within one map, but they are still placed at intervals of the base tile size.
      */
    var baseHeight: integer = js.native
    /**
      * The map's base width of a tile in pixels. Tiled maps support multiple tileset sizes
      * within one map, but they are still placed at intervals of the base tile size.
      */
    var baseWidth: integer = js.native
    /**
      * True if this tile can collide on any of its faces or has a collision callback set.
      */
    val canCollide: Boolean = js.native
    /**
      * Whether the tile should collide with any object on the bottom side.
      */
    var collideDown: Boolean = js.native
    /**
      * Whether the tile should collide with any object on the left side.
      */
    var collideLeft: Boolean = js.native
    /**
      * Whether the tile should collide with any object on the right side.
      */
    var collideRight: Boolean = js.native
    /**
      * Whether the tile should collide with any object on the top side.
      */
    var collideUp: Boolean = js.native
    /**
      * True if this tile can collide on any of its faces.
      */
    val collides: Boolean = js.native
    /**
      * Tile collision callback.
      */
    var collisionCallback: js.Function = js.native
    /**
      * The context in which the collision callback will be called.
      */
    var collisionCallbackContext: js.Object = js.native
    /**
      * Whether the tile's bottom edge is interesting for collisions.
      */
    var faceBottom: Boolean = js.native
    /**
      * Whether the tile's left edge is interesting for collisions.
      */
    var faceLeft: Boolean = js.native
    /**
      * Whether the tile's right edge is interesting for collisions.
      */
    var faceRight: Boolean = js.native
    /**
      * Whether the tile's top edge is interesting for collisions.
      */
    var faceTop: Boolean = js.native
    /**
      * The horizontally flipped state of the Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override var flipX: Boolean = js.native
    /**
      * The vertically flipped state of the Game Object.
      * 
      * A Game Object that is flipped vertically will render inversed on the vertical axis (i.e. upside down)
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override var flipY: Boolean = js.native
    /**
      * True if this tile has any interesting faces.
      */
    val hasInterestingFace: Boolean = js.native
    /**
      * The height of the tile in pixels.
      */
    var height: integer = js.native
    /**
      * The index of this tile within the map data corresponding to the tileset, or -1 if this
      * represents a blank tile.
      */
    var index: integer = js.native
    /**
      * The LayerData in the Tilemap data that this tile belongs to.
      */
    var layer: LayerData = js.native
    /**
      * An empty object where physics-engine specific information (e.g. bodies) may be stored.
      */
    var physics: js.Object = js.native
    /**
      * The x coordinate of the top left of this tile in pixels. This is relative to the top left
      * of the layer this tile is being rendered within. This property does NOT factor in camera
      * scroll, layer scale or layer position.
      */
    var pixelX: Double = js.native
    /**
      * The y coordinate of the top left of this tile in pixels. This is relative to the top left
      * of the layer this tile is being rendered within. This property does NOT factor in camera
      * scroll, layer scale or layer position.
      */
    var pixelY: Double = js.native
    /**
      * Tile specific properties. These usually come from Tiled.
      */
    var properties: js.Any = js.native
    /**
      * The rotation angle of this tile.
      */
    var rotation: Double = js.native
    /**
      * The tilemap that contains this Tile. This will only return null if accessed from a LayerData
      * instance before the tile is placed within a StaticTilemapLayer or DynamicTilemapLayer.
      */
    val tilemap: Tilemap = js.native
    /**
      * The tilemap layer that contains this Tile. This will only return null if accessed from a
      * LayerData instance before the tile is placed within a StaticTilemapLayer or
      * DynamicTilemapLayer.
      */
    val tilemapLayer: StaticTilemapLayer | DynamicTilemapLayer = js.native
    /**
      * The tileset that contains this Tile. This is null if accessed from a LayerData instance
      * before the tile is placed in a StaticTilemapLayer or DynamicTilemapLayer, or if the tile has
      * an index that doesn't correspond to any of the map's tilesets.
      */
    val tileset: Tileset = js.native
    /**
      * The tint to apply to this tile. Note: tint is currently a single color value instead of
      * the 4 corner tint component on other GameObjects.
      */
    var tint: Double = js.native
    /**
      * The visible state of the Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      */
    /* CompleteClass */
    override var visible: Boolean = js.native
    /**
      * The width of the tile in pixels.
      */
    var width: integer = js.native
    /**
      * The x map coordinate of this tile in tile units.
      */
    var x: integer = js.native
    /**
      * The y map coordinate of this tile in tile units.
      */
    var y: integer = js.native
    /**
      * Check if the given x and y world coordinates are within this Tile. This does not factor in
      * camera scroll, layer scale or layer position.
      * @param x The x coordinate to test.
      * @param y The y coordinate to test.
      */
    def containsPoint(x: Double, y: Double): Boolean = js.native
    /**
      * Copies the tile data & properties from the given tile to this tile. This copies everything
      * except for position and interesting faces.
      * @param tile The tile to copy from.
      */
    def copy(tile: Tile): Tile = js.native
    /**
      * Clean up memory.
      */
    def destroy(): Unit = js.native
    /**
      * Gets the world Y position of the bottom side of the tile, factoring in the layer's position,
      * scale and scroll.
      * @param camera The Camera to use to perform the check.
      */
    def getBottom(): Double = js.native
    def getBottom(camera: Camera): Double = js.native
    /**
      * Gets the world rectangle bounding box for the tile, factoring in the layers position,
      * scale and scroll.
      * @param camera The Camera to use to perform the check.
      * @param output [description]
      */
    def getBounds(): Rectangle | js.Object = js.native
    def getBounds(camera: Camera): Rectangle | js.Object = js.native
    def getBounds(camera: Camera, output: js.Object): Rectangle | js.Object = js.native
    /**
      * Gets the world X position of the center of the tile, factoring in the layer's position,
      * scale and scroll.
      * @param camera The Camera to use to perform the check.
      */
    def getCenterX(): Double = js.native
    def getCenterX(camera: Camera): Double = js.native
    /**
      * Gets the world Y position of the center of the tile, factoring in the layer's position,
      * scale and scroll.
      * @param camera The Camera to use to perform the check.
      */
    def getCenterY(): Double = js.native
    def getCenterY(camera: Camera): Double = js.native
    /**
      * The collision group for this Tile, defined within the Tileset. This returns a reference to
      * the collision group stored within the Tileset, so any modification of the returned object
      * will impact all tiles that have the same index as this tile.
      */
    def getCollisionGroup(): js.Object = js.native
    /**
      * Gets the world X position of the left side of the tile, factoring in the layers position,
      * scale and scroll.
      * @param camera The Camera to use to perform the check.
      */
    def getLeft(): Double = js.native
    def getLeft(camera: Camera): Double = js.native
    /**
      * Gets the world X position of the right side of the tile, factoring in the layer's position,
      * scale and scroll.
      * @param camera The Camera to use to perform the check.
      */
    def getRight(): Double = js.native
    def getRight(camera: Camera): Double = js.native
    /**
      * The tile data for this Tile, defined within the Tileset. This typically contains Tiled
      * collision data, tile animations and terrain information. This returns a reference to the tile
      * data stored within the Tileset, so any modification of the returned object will impact all
      * tiles that have the same index as this tile.
      */
    def getTileData(): js.Object = js.native
    /**
      * Gets the world Y position of the top side of the tile, factoring in the layer's position,
      * scale and scroll.
      * @param camera The Camera to use to perform the check.
      */
    def getTop(): Double = js.native
    def getTop(camera: Camera): Double = js.native
    /**
      * Check for intersection with this tile. This does not factor in camera scroll, layer scale or
      * layer position.
      * @param x The x axis in pixels.
      * @param y The y axis in pixels.
      * @param right The right point.
      * @param bottom The bottom point.
      */
    def intersects(x: Double, y: Double, right: Double, bottom: Double): Boolean = js.native
    /**
      * Checks if the tile is interesting.
      * @param collides If true, will consider the tile interesting if it collides on any side.
      * @param faces If true, will consider the tile interesting if it has an interesting face.
      */
    def isInteresting(collides: Boolean, faces: Boolean): Boolean = js.native
    /**
      * Reset collision status flags.
      * @param recalculateFaces Whether or not to recalculate interesting faces for this tile and its neighbors. Default true.
      */
    def resetCollision(): Tile = js.native
    def resetCollision(recalculateFaces: Boolean): Tile = js.native
    /**
      * Reset faces.
      */
    def resetFaces(): Tile = js.native
    /**
      * Resets the horizontal and vertical flipped state of this Game Object back to their default un-flipped state.
      */
    /* CompleteClass */
    override def resetFlip(): this.type = js.native
    /**
      * Sets the collision flags for each side of this tile and updates the interesting faces list.
      * @param left Indicating collide with any object on the left.
      * @param right Indicating collide with any object on the right.
      * @param up Indicating collide with any object on the top.
      * @param down Indicating collide with any object on the bottom.
      * @param recalculateFaces Whether or not to recalculate interesting faces
      * for this tile and its neighbors. Default true.
      */
    def setCollision(left: Boolean): Tile = js.native
    def setCollision(left: Boolean, right: Boolean): Tile = js.native
    def setCollision(left: Boolean, right: Boolean, up: Boolean): Tile = js.native
    def setCollision(left: Boolean, right: Boolean, up: Boolean, down: Boolean): Tile = js.native
    def setCollision(left: Boolean, right: Boolean, up: Boolean, down: Boolean, recalculateFaces: Boolean): Tile = js.native
    /**
      * Set a callback to be called when this tile is hit by an object. The callback must true for
      * collision processing to take place.
      * @param callback Callback function.
      * @param context Callback will be called within this context.
      */
    def setCollisionCallback(callback: js.Function, context: js.Object): Tile = js.native
    /**
      * Sets the horizontal and vertical flipped state of this Game Object.
      * 
      * A Game Object that is flipped will render inversed on the flipped axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      * @param x The horizontal flipped state. `false` for no flip, or `true` to be flipped.
      * @param y The horizontal flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlip(x: Boolean, y: Boolean): this.type = js.native
    /**
      * Sets the horizontal flipped state of this Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      * @param value The flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlipX(value: Boolean): this.type = js.native
    /**
      * Sets the vertical flipped state of this Game Object.
      * @param value The flipped state. `false` for no flip, or `true` to be flipped.
      */
    /* CompleteClass */
    override def setFlipY(value: Boolean): this.type = js.native
    /**
      * Sets the size of the tile and updates its pixelX and pixelY.
      * @param tileWidth The width of the tile in pixels.
      * @param tileHeight The height of the tile in pixels.
      * @param baseWidth The base width a tile in the map (in pixels).
      * @param baseHeight The base height of the tile in pixels (in pixels).
      */
    def setSize(tileWidth: integer, tileHeight: integer, baseWidth: integer, baseHeight: integer): Tile = js.native
    /**
      * Sets the visibility of this Game Object.
      * 
      * An invisible Game Object will skip rendering, but will still process update logic.
      * @param value The visible state of the Game Object.
      */
    /* CompleteClass */
    override def setVisible(value: Boolean): this.type = js.native
    /**
      * Toggles the horizontal flipped state of this Game Object.
      * 
      * A Game Object that is flipped horizontally will render inversed on the horizontal axis.
      * Flipping always takes place from the middle of the texture and does not impact the scale value.
      * If this Game Object has a physics body, it will not change the body. This is a rendering toggle only.
      */
    /* CompleteClass */
    override def toggleFlipX(): this.type = js.native
    /**
      * Toggles the vertical flipped state of this Game Object.
      */
    /* CompleteClass */
    override def toggleFlipY(): this.type = js.native
    /**
      * Used internally. Updates the tile's world XY position based on the current tile size.
      */
    def updatePixelXY(): Tile = js.native
  }
  
  /**
    * A Tilemap is a container for Tilemap data. This isn't a display object, rather, it holds data
    * about the map and allows you to add tilesets and tilemap layers to it. A map can have one or
    * more tilemap layers (StaticTilemapLayer or DynamicTilemapLayer), which are the display
    * objects that actually render tiles.
    * 
    * The Tilemap data be parsed from a Tiled JSON file, a CSV file or a 2D array. Tiled is a free
    * software package specifically for creating tile maps, and is available from:
    * http://www.mapeditor.org
    * 
    * A Tilemap has handy methods for getting & manipulating the tiles within a layer. You can only
    * use the methods that change tiles (e.g. removeTileAt) on a DynamicTilemapLayer.
    * 
    * Note that all Tilemaps use a base tile size to calculate dimensions from, but that a
    * StaticTilemapLayer or DynamicTilemapLayer may have its own unique tile size that overrides
    * it.
    * 
    * As of Phaser 3.21.0, if your tilemap includes layer groups (a feature of Tiled 1.2.0+) these
    * will be traversed and the following properties will affect children:
    * - opacity (blended with parent) and visibility (parent overrides child)
    * - Vertical and horizontal offset
    * The grouping hierarchy is not preserved and all layers will be flattened into a single array.
    * Group layers are parsed during Tilemap construction but are discarded after parsing so dynamic
    * layers will NOT continue to be affected by a parent.
    * 
    * To avoid duplicate layer names, a layer that is a child of a group layer will have its parent
    * group name prepended with a '/'.  For example, consider a group called 'ParentGroup' with a
    * child called 'Layer 1'. In the Tilemap object, 'Layer 1' will have the name
    * 'ParentGroup/Layer 1'.
    */
  @js.native
  class Tilemap protected () extends js.Object {
    /**
      * 
      * @param scene The Scene to which this Tilemap belongs.
      * @param mapData A MapData instance containing Tilemap data.
      */
    def this(scene: Scene, mapData: MapData) = this()
    /**
      * The index of the currently selected LayerData object.
      */
    var currentLayerIndex: integer = js.native
    /**
      * The format of the map data.
      */
    var format: Double = js.native
    /**
      * The height of the map (in tiles).
      */
    var height: Double = js.native
    /**
      * The height of the map in pixels based on height * tileHeight.
      */
    var heightInPixels: Double = js.native
    var imageCollections: js.Array[ImageCollection] = js.native
    /**
      * An array of Tiled Image Layers.
      */
    var images: js.Array[_] = js.native
    /**
      * The LayerData object that is currently selected in the map. You can set this property using
      * any type supported by setLayer.
      */
    var layer: LayerData = js.native
    /**
      * An array of Tilemap layer data.
      */
    var layers: js.Array[LayerData] = js.native
    /**
      * An array of ObjectLayer instances parsed from Tiled object layers.
      */
    var objects: js.Array[ObjectLayer] = js.native
    /**
      * The orientation of the map data (as specified in Tiled), usually 'orthogonal'.
      */
    var orientation: String = js.native
    /**
      * Map specific properties as specified in Tiled.
      */
    var properties: js.Object = js.native
    /**
      * The render (draw) order of the map data (as specified in Tiled), usually 'right-down'.
      * 
      * The draw orders are:
      * 
      * right-down
      * left-down
      * right-up
      * left-up
      * 
      * This can be changed via the `setRenderOrder` method.
      */
    var renderOrder: String = js.native
    var scene: Scene = js.native
    /**
      * The base height of a tile in pixels. Note that individual layers may have a different
      * tile height.
      */
    var tileHeight: integer = js.native
    /**
      * The base width of a tile in pixels. Note that individual layers may have a different tile
      * width.
      */
    var tileWidth: integer = js.native
    /**
      * An array of Tilesets used in the map.
      */
    var tilesets: js.Array[Tileset] = js.native
    /**
      * The version of the map data (as specified in Tiled, usually 1).
      */
    var version: Double = js.native
    /**
      * The width of the map (in tiles).
      */
    var width: Double = js.native
    /**
      * The width of the map in pixels based on width * tileWidth.
      */
    var widthInPixels: Double = js.native
    /**
      * Adds an image to the map to be used as a tileset. A single map may use multiple tilesets.
      * Note that the tileset name can be found in the JSON file exported from Tiled, or in the Tiled
      * editor.
      * @param tilesetName The name of the tileset as specified in the map data.
      * @param key The key of the Phaser.Cache image used for this tileset. If
      * `undefined` or `null` it will look for an image with a key matching the tilesetName parameter.
      * @param tileWidth The width of the tile (in pixels) in the Tileset Image. If not
      * given it will default to the map's tileWidth value, or the tileWidth specified in the Tiled
      * JSON file.
      * @param tileHeight The height of the tiles (in pixels) in the Tileset Image. If
      * not given it will default to the map's tileHeight value, or the tileHeight specified in the
      * Tiled JSON file.
      * @param tileMargin The margin around the tiles in the sheet (in pixels). If not
      * specified, it will default to 0 or the value specified in the Tiled JSON file.
      * @param tileSpacing The spacing between each the tile in the sheet (in pixels).
      * If not specified, it will default to 0 or the value specified in the Tiled JSON file.
      * @param gid If adding multiple tilesets to a blank map, specify the starting
      * GID this set will use here. Default 0.
      */
    def addTilesetImage(
      tilesetName: String,
      key: js.UndefOr[String],
      tileWidth: js.UndefOr[integer],
      tileHeight: js.UndefOr[integer],
      tileMargin: js.UndefOr[integer],
      tileSpacing: js.UndefOr[integer],
      gid: js.UndefOr[integer]
    ): Tileset = js.native
    /**
      * Calculates interesting faces at the given tile coordinates of the specified layer. Interesting
      * faces are used internally for optimizing collisions against tiles. This method is mostly used
      * internally to optimize recalculating faces when only one tile has been changed.
      * 
      * If no layer specified, the maps current layer is used.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def calculateFacesAt(tileX: integer, tileY: integer): Tilemap = js.native
    def calculateFacesAt(tileX: integer, tileY: integer, layer: String): Tilemap = js.native
    def calculateFacesAt(tileX: integer, tileY: integer, layer: DynamicTilemapLayer): Tilemap = js.native
    def calculateFacesAt(tileX: integer, tileY: integer, layer: StaticTilemapLayer): Tilemap = js.native
    def calculateFacesAt(tileX: integer, tileY: integer, layer: integer): Tilemap = js.native
    /**
      * Calculates interesting faces within the rectangular area specified (in tile coordinates) of the
      * layer. Interesting faces are used internally for optimizing collisions against tiles. This method
      * is mostly used internally.
      * 
      * If no layer specified, the map's current layer is used.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def calculateFacesWithin(): Tilemap = js.native
    def calculateFacesWithin(tileX: integer): Tilemap = js.native
    def calculateFacesWithin(tileX: integer, tileY: integer): Tilemap = js.native
    def calculateFacesWithin(tileX: integer, tileY: integer, width: integer): Tilemap = js.native
    def calculateFacesWithin(tileX: integer, tileY: integer, width: integer, height: integer): Tilemap = js.native
    def calculateFacesWithin(tileX: integer, tileY: integer, width: integer, height: integer, layer: String): Tilemap = js.native
    def calculateFacesWithin(tileX: integer, tileY: integer, width: integer, height: integer, layer: DynamicTilemapLayer): Tilemap = js.native
    def calculateFacesWithin(tileX: integer, tileY: integer, width: integer, height: integer, layer: StaticTilemapLayer): Tilemap = js.native
    def calculateFacesWithin(tileX: integer, tileY: integer, width: integer, height: integer, layer: integer): Tilemap = js.native
    /**
      * Turns the DynamicTilemapLayer associated with the given layer into a StaticTilemapLayer. If
      * no layer specified, the map's current layer is used. This is useful if you want to manipulate
      * a map at the start of a scene, but then make it non-manipulable and optimize it for speed.
      * Note: the DynamicTilemapLayer passed in is destroyed, so make sure to store the value
      * returned from this method if you want to manipulate the new StaticTilemapLayer.
      * @param layer The name of the layer from Tiled, the
      * index of the layer in the map, or a DynamicTilemapLayer.
      */
    def convertLayerToStatic(): StaticTilemapLayer = js.native
    def convertLayerToStatic(layer: String): StaticTilemapLayer = js.native
    def convertLayerToStatic(layer: DynamicTilemapLayer): StaticTilemapLayer = js.native
    def convertLayerToStatic(layer: integer): StaticTilemapLayer = js.native
    /**
      * Copies the tiles in the source rectangular area to a new destination (all specified in tile
      * coordinates) within the layer. This copies all tile properties & recalculates collision
      * information in the destination region.
      * 
      * If no layer specified, the map's current layer is used. This cannot be applied to StaticTilemapLayers.
      * @param srcTileX The x coordinate of the area to copy from, in tiles, not pixels.
      * @param srcTileY The y coordinate of the area to copy from, in tiles, not pixels.
      * @param width The width of the area to copy, in tiles, not pixels.
      * @param height The height of the area to copy, in tiles, not pixels.
      * @param destTileX The x coordinate of the area to copy to, in tiles, not pixels.
      * @param destTileY The y coordinate of the area to copy to, in tiles, not pixels.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def copy(
      srcTileX: integer,
      srcTileY: integer,
      width: integer,
      height: integer,
      destTileX: integer,
      destTileY: integer
    ): Tilemap = js.native
    def copy(
      srcTileX: integer,
      srcTileY: integer,
      width: integer,
      height: integer,
      destTileX: integer,
      destTileY: integer,
      recalculateFaces: Boolean
    ): Tilemap = js.native
    def copy(
      srcTileX: integer,
      srcTileY: integer,
      width: integer,
      height: integer,
      destTileX: integer,
      destTileY: integer,
      recalculateFaces: Boolean,
      layer: String
    ): Tilemap = js.native
    def copy(
      srcTileX: integer,
      srcTileY: integer,
      width: integer,
      height: integer,
      destTileX: integer,
      destTileY: integer,
      recalculateFaces: Boolean,
      layer: DynamicTilemapLayer
    ): Tilemap = js.native
    def copy(
      srcTileX: integer,
      srcTileY: integer,
      width: integer,
      height: integer,
      destTileX: integer,
      destTileY: integer,
      recalculateFaces: Boolean,
      layer: StaticTilemapLayer
    ): Tilemap = js.native
    def copy(
      srcTileX: integer,
      srcTileY: integer,
      width: integer,
      height: integer,
      destTileX: integer,
      destTileY: integer,
      recalculateFaces: Boolean,
      layer: integer
    ): Tilemap = js.native
    /**
      * Creates a new and empty DynamicTilemapLayer. The currently selected layer in the map is set to this new layer.
      * @param name The name of this layer. Must be unique within the map.
      * @param tileset The tileset, or an array of tilesets, used to render this layer. Can be a string or a Tileset object.
      * @param x The world x position where the top left of this layer will be placed. Default 0.
      * @param y The world y position where the top left of this layer will be placed. Default 0.
      * @param width The width of the layer in tiles. If not specified, it will default to the map's width.
      * @param height The height of the layer in tiles. If not specified, it will default to the map's height.
      * @param tileWidth The width of the tiles the layer uses for calculations. If not specified, it will default to the map's tileWidth.
      * @param tileHeight The height of the tiles the layer uses for calculations. If not specified, it will default to the map's tileHeight.
      */
    def createBlankDynamicLayer(
      name: String,
      tileset: String,
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      width: js.UndefOr[integer],
      height: js.UndefOr[integer],
      tileWidth: js.UndefOr[integer],
      tileHeight: js.UndefOr[integer]
    ): DynamicTilemapLayer = js.native
    def createBlankDynamicLayer(
      name: String,
      tileset: js.Array[String | Tileset],
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      width: js.UndefOr[integer],
      height: js.UndefOr[integer],
      tileWidth: js.UndefOr[integer],
      tileHeight: js.UndefOr[integer]
    ): DynamicTilemapLayer = js.native
    def createBlankDynamicLayer(
      name: String,
      tileset: Tileset,
      x: js.UndefOr[Double],
      y: js.UndefOr[Double],
      width: js.UndefOr[integer],
      height: js.UndefOr[integer],
      tileWidth: js.UndefOr[integer],
      tileHeight: js.UndefOr[integer]
    ): DynamicTilemapLayer = js.native
    def createDynamicLayer(layerID: String, tileset: String): DynamicTilemapLayer = js.native
    def createDynamicLayer(layerID: String, tileset: String, x: Double): DynamicTilemapLayer = js.native
    def createDynamicLayer(layerID: String, tileset: String, x: Double, y: Double): DynamicTilemapLayer = js.native
    def createDynamicLayer(layerID: String, tileset: js.Array[String | Tileset]): DynamicTilemapLayer = js.native
    def createDynamicLayer(layerID: String, tileset: js.Array[String | Tileset], x: Double): DynamicTilemapLayer = js.native
    def createDynamicLayer(layerID: String, tileset: js.Array[String | Tileset], x: Double, y: Double): DynamicTilemapLayer = js.native
    def createDynamicLayer(layerID: String, tileset: Tileset): DynamicTilemapLayer = js.native
    def createDynamicLayer(layerID: String, tileset: Tileset, x: Double): DynamicTilemapLayer = js.native
    def createDynamicLayer(layerID: String, tileset: Tileset, x: Double, y: Double): DynamicTilemapLayer = js.native
    /**
      * Creates a new DynamicTilemapLayer that renders the LayerData associated with the given
      * `layerID`. The currently selected layer in the map is set to this new layer.
      * 
      * The `layerID` is important. If you've created your map in Tiled then you can get this by
      * looking in Tiled and looking at the layer name. Or you can open the JSON file it exports and
      * look at the layers[].name value. Either way it must match.
      * 
      * Unlike a static layer, a dynamic layer can be modified. See DynamicTilemapLayer for more
      * information.
      * @param layerID The layer array index value, or if a string is given, the layer name from Tiled.
      * @param tileset The tileset, or an array of tilesets, used to render this layer. Can be a string or a Tileset object.
      * @param x The x position to place the layer in the world. If not specified, it will default to the layer offset from Tiled or 0. Default 0.
      * @param y The y position to place the layer in the world. If not specified, it will default to the layer offset from Tiled or 0. Default 0.
      */
    def createDynamicLayer(layerID: integer, tileset: String): DynamicTilemapLayer = js.native
    def createDynamicLayer(layerID: integer, tileset: String, x: Double): DynamicTilemapLayer = js.native
    def createDynamicLayer(layerID: integer, tileset: String, x: Double, y: Double): DynamicTilemapLayer = js.native
    def createDynamicLayer(layerID: integer, tileset: js.Array[String | Tileset]): DynamicTilemapLayer = js.native
    def createDynamicLayer(layerID: integer, tileset: js.Array[String | Tileset], x: Double): DynamicTilemapLayer = js.native
    def createDynamicLayer(layerID: integer, tileset: js.Array[String | Tileset], x: Double, y: Double): DynamicTilemapLayer = js.native
    def createDynamicLayer(layerID: integer, tileset: Tileset): DynamicTilemapLayer = js.native
    def createDynamicLayer(layerID: integer, tileset: Tileset, x: Double): DynamicTilemapLayer = js.native
    def createDynamicLayer(layerID: integer, tileset: Tileset, x: Double, y: Double): DynamicTilemapLayer = js.native
    def createFromObjects(name: String, id: String, spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
    def createFromObjects(name: String, id: String, spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
    /**
      * Creates a Sprite for every object matching the given gid in the map data. All properties from
      * the map data objectgroup are copied into the `spriteConfig`, so you can use this as an easy
      * way to configure Sprite properties from within the map editor. For example giving an object a
      * property of alpha: 0.5 in the map editor will duplicate that when the Sprite is created.
      * 
      * Custom object properties not sharing names with the Sprite's own properties are copied to the
      * Sprite's {@link Phaser.GameObjects.Sprite#data data store}.
      * @param name The name of the object layer (from Tiled) to create Sprites from.
      * @param id Either the id (object), gid (tile object) or name (object or
      * tile object) from Tiled. Ids are unique in Tiled, but a gid is shared by all tile objects
      * with the same graphic. The same name can be used on multiple objects.
      * @param spriteConfig The config object to pass into the Sprite creator (i.e.
      * scene.make.sprite).
      * @param scene The Scene to create the Sprites within. Default the scene the map is within.
      */
    def createFromObjects(name: String, id: integer, spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
    def createFromObjects(name: String, id: integer, spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(indexes: js.Array[_], replacements: js.Array[_], spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
    def createFromTiles(indexes: js.Array[_], replacements: js.Array[_], spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: js.Array[_],
      replacements: js.Array[_],
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera
    ): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: js.Array[_],
      replacements: js.Array[_],
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera,
      layer: String
    ): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: js.Array[_],
      replacements: js.Array[_],
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera,
      layer: DynamicTilemapLayer
    ): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: js.Array[_],
      replacements: js.Array[_],
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera,
      layer: StaticTilemapLayer
    ): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: js.Array[_],
      replacements: js.Array[_],
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera,
      layer: integer
    ): js.Array[Sprite] = js.native
    def createFromTiles(indexes: js.Array[_], replacements: integer, spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
    def createFromTiles(indexes: js.Array[_], replacements: integer, spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: js.Array[_],
      replacements: integer,
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera
    ): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: js.Array[_],
      replacements: integer,
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera,
      layer: String
    ): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: js.Array[_],
      replacements: integer,
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera,
      layer: DynamicTilemapLayer
    ): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: js.Array[_],
      replacements: integer,
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera,
      layer: StaticTilemapLayer
    ): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: js.Array[_],
      replacements: integer,
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera,
      layer: integer
    ): js.Array[Sprite] = js.native
    def createFromTiles(indexes: integer, replacements: js.Array[_], spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
    def createFromTiles(indexes: integer, replacements: js.Array[_], spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: integer,
      replacements: js.Array[_],
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera
    ): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: integer,
      replacements: js.Array[_],
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera,
      layer: String
    ): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: integer,
      replacements: js.Array[_],
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera,
      layer: DynamicTilemapLayer
    ): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: integer,
      replacements: js.Array[_],
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera,
      layer: StaticTilemapLayer
    ): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: integer,
      replacements: js.Array[_],
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera,
      layer: integer
    ): js.Array[Sprite] = js.native
    /**
      * Creates a Sprite for every object matching the given tile indexes in the layer. You can
      * optionally specify if each tile will be replaced with a new tile after the Sprite has been
      * created. This is useful if you want to lay down special tiles in a level that are converted to
      * Sprites, but want to replace the tile itself with a floor tile or similar once converted.
      * @param indexes The tile index, or array of indexes, to create Sprites from.
      * @param replacements The tile index, or array of indexes, to change a converted
      * tile to. Set to `null` to leave the tiles unchanged. If an array is given, it is assumed to be a
      * one-to-one mapping with the indexes array.
      * @param spriteConfig The config object to pass into the Sprite creator (i.e. scene.make.sprite).
      * @param scene The Scene to create the Sprites within. Default scene the map is within.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def createFromTiles(indexes: integer, replacements: integer, spriteConfig: SpriteConfig): js.Array[Sprite] = js.native
    def createFromTiles(indexes: integer, replacements: integer, spriteConfig: SpriteConfig, scene: Scene): js.Array[Sprite] = js.native
    def createFromTiles(indexes: integer, replacements: integer, spriteConfig: SpriteConfig, scene: Scene, camera: Camera): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: integer,
      replacements: integer,
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera,
      layer: String
    ): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: integer,
      replacements: integer,
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera,
      layer: DynamicTilemapLayer
    ): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: integer,
      replacements: integer,
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera,
      layer: StaticTilemapLayer
    ): js.Array[Sprite] = js.native
    def createFromTiles(
      indexes: integer,
      replacements: integer,
      spriteConfig: SpriteConfig,
      scene: Scene,
      camera: Camera,
      layer: integer
    ): js.Array[Sprite] = js.native
    def createStaticLayer(layerID: String, tileset: String): StaticTilemapLayer = js.native
    def createStaticLayer(layerID: String, tileset: String, x: Double): StaticTilemapLayer = js.native
    def createStaticLayer(layerID: String, tileset: String, x: Double, y: Double): StaticTilemapLayer = js.native
    def createStaticLayer(layerID: String, tileset: js.Array[String | Tileset]): StaticTilemapLayer = js.native
    def createStaticLayer(layerID: String, tileset: js.Array[String | Tileset], x: Double): StaticTilemapLayer = js.native
    def createStaticLayer(layerID: String, tileset: js.Array[String | Tileset], x: Double, y: Double): StaticTilemapLayer = js.native
    def createStaticLayer(layerID: String, tileset: Tileset): StaticTilemapLayer = js.native
    def createStaticLayer(layerID: String, tileset: Tileset, x: Double): StaticTilemapLayer = js.native
    def createStaticLayer(layerID: String, tileset: Tileset, x: Double, y: Double): StaticTilemapLayer = js.native
    /**
      * Creates a new StaticTilemapLayer that renders the LayerData associated with the given
      * `layerID`. The currently selected layer in the map is set to this new layer.
      * 
      * The `layerID` is important. If you've created your map in Tiled then you can get this by
      * looking in Tiled and looking at the layer name. Or you can open the JSON file it exports and
      * look at the layers[].name value. Either way it must match.
      * 
      * It's important to remember that a static layer cannot be modified. See StaticTilemapLayer for
      * more information.
      * @param layerID The layer array index value, or if a string is given, the layer name from Tiled.
      * @param tileset The tileset, or an array of tilesets, used to render this layer. Can be a string or a Tileset object.
      * @param x The x position to place the layer in the world. If not specified, it will default to the layer offset from Tiled or 0. Default 0.
      * @param y The y position to place the layer in the world. If not specified, it will default to the layer offset from Tiled or 0. Default 0.
      */
    def createStaticLayer(layerID: integer, tileset: String): StaticTilemapLayer = js.native
    def createStaticLayer(layerID: integer, tileset: String, x: Double): StaticTilemapLayer = js.native
    def createStaticLayer(layerID: integer, tileset: String, x: Double, y: Double): StaticTilemapLayer = js.native
    def createStaticLayer(layerID: integer, tileset: js.Array[String | Tileset]): StaticTilemapLayer = js.native
    def createStaticLayer(layerID: integer, tileset: js.Array[String | Tileset], x: Double): StaticTilemapLayer = js.native
    def createStaticLayer(layerID: integer, tileset: js.Array[String | Tileset], x: Double, y: Double): StaticTilemapLayer = js.native
    def createStaticLayer(layerID: integer, tileset: Tileset): StaticTilemapLayer = js.native
    def createStaticLayer(layerID: integer, tileset: Tileset, x: Double): StaticTilemapLayer = js.native
    def createStaticLayer(layerID: integer, tileset: Tileset, x: Double, y: Double): StaticTilemapLayer = js.native
    /**
      * Removes all layer data from this Tilemap and nulls the scene reference. This will destroy any
      * StaticTilemapLayers or DynamicTilemapLayers that have been linked to LayerData.
      */
    def destroy(): Unit = js.native
    /**
      * Destroys the given TilemapLayer and removes it from this Tilemap.
      * 
      * If no layer specified, the map's current layer is used.
      * @param layer The tile layer to be destroyed.
      */
    def destroyLayer(): Tilemap = js.native
    def destroyLayer(layer: String): Tilemap = js.native
    def destroyLayer(layer: DynamicTilemapLayer): Tilemap = js.native
    def destroyLayer(layer: StaticTilemapLayer): Tilemap = js.native
    def destroyLayer(layer: integer): Tilemap = js.native
    /**
      * Sets the tiles in the given rectangular area (in tile coordinates) of the layer with the
      * specified index. Tiles will be set to collide if the given index is a colliding index.
      * Collision information in the region will be recalculated.
      * 
      * If no layer specified, the map's current layer is used.
      * This cannot be applied to StaticTilemapLayers.
      * @param index The tile index to fill the area with.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def fill(
      index: integer,
      tileX: js.UndefOr[integer],
      tileY: js.UndefOr[integer],
      width: js.UndefOr[integer],
      height: js.UndefOr[integer],
      recalculateFaces: js.UndefOr[Boolean],
      layer: js.UndefOr[DynamicTilemapLayer | StaticTilemapLayer | String | integer]
    ): Tilemap = js.native
    def filterObjects(objectLayer: String, callback: TilemapFilterCallback): js.Array[GameObject] = js.native
    def filterObjects(objectLayer: String, callback: TilemapFilterCallback, context: js.Object): js.Array[GameObject] = js.native
    /**
      * For each object in the given object layer, run the given filter callback function. Any
      * objects that pass the filter test (i.e. where the callback returns true) will returned as a
      * new array. Similar to Array.prototype.Filter in vanilla JS.
      * @param objectLayer The name of an object layer (from Tiled) or an ObjectLayer instance.
      * @param callback The callback. Each object in the given area will be passed to this callback as the first and only parameter.
      * @param context The context under which the callback should be run.
      */
    def filterObjects(objectLayer: ObjectLayer, callback: TilemapFilterCallback): js.Array[GameObject] = js.native
    def filterObjects(objectLayer: ObjectLayer, callback: TilemapFilterCallback, context: js.Object): js.Array[GameObject] = js.native
    /**
      * For each tile in the given rectangular area (in tile coordinates) of the layer, run the given
      * filter callback function. Any tiles that pass the filter test (i.e. where the callback returns
      * true) will returned as a new array. Similar to Array.prototype.Filter in vanilla JS.
      * If no layer specified, the map's current layer is used.
      * @param callback The callback. Each tile in the given area will be passed to this
      * callback as the first and only parameter. The callback should return true for tiles that pass the
      * filter.
      * @param context The context under which the callback should be run.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area to filter. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area to filter. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def filterTiles(
      callback: js.Function,
      context: js.UndefOr[js.Object],
      tileX: js.UndefOr[integer],
      tileY: js.UndefOr[integer],
      width: js.UndefOr[integer],
      height: js.UndefOr[integer],
      filteringOptions: js.UndefOr[FilteringOptions],
      layer: js.UndefOr[DynamicTilemapLayer | StaticTilemapLayer | String | integer]
    ): js.Array[Tile] = js.native
    /**
      * Searches the entire map layer for the first tile matching the given index, then returns that Tile
      * object. If no match is found, it returns null. The search starts from the top-left tile and
      * continues horizontally until it hits the end of the row, then it drops down to the next column.
      * If the reverse boolean is true, it scans starting from the bottom-right corner traveling up to
      * the top-left.
      * If no layer specified, the map's current layer is used.
      * @param index The tile index value to search for.
      * @param skip The number of times to skip a matching tile before returning. Default 0.
      * @param reverse If true it will scan the layer in reverse, starting at the bottom-right. Otherwise it scans from the top-left. Default false.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def findByIndex(index: integer): Tile = js.native
    def findByIndex(index: integer, skip: integer): Tile = js.native
    def findByIndex(index: integer, skip: integer, reverse: Boolean): Tile = js.native
    def findByIndex(index: integer, skip: integer, reverse: Boolean, layer: String): Tile = js.native
    def findByIndex(index: integer, skip: integer, reverse: Boolean, layer: DynamicTilemapLayer): Tile = js.native
    def findByIndex(index: integer, skip: integer, reverse: Boolean, layer: StaticTilemapLayer): Tile = js.native
    def findByIndex(index: integer, skip: integer, reverse: Boolean, layer: integer): Tile = js.native
    def findObject(objectLayer: String, callback: TilemapFindCallback): GameObject = js.native
    def findObject(objectLayer: String, callback: TilemapFindCallback, context: js.Object): GameObject = js.native
    /**
      * Find the first object in the given object layer that satisfies the provided testing function.
      * I.e. finds the first object for which `callback` returns true. Similar to
      * Array.prototype.find in vanilla JS.
      * @param objectLayer The name of an object layer (from Tiled) or an ObjectLayer instance.
      * @param callback The callback. Each object in the given area will be passed to this callback as the first and only parameter.
      * @param context The context under which the callback should be run.
      */
    def findObject(objectLayer: ObjectLayer, callback: TilemapFindCallback): GameObject = js.native
    def findObject(objectLayer: ObjectLayer, callback: TilemapFindCallback, context: js.Object): GameObject = js.native
    /**
      * Find the first tile in the given rectangular area (in tile coordinates) of the layer that
      * satisfies the provided testing function. I.e. finds the first tile for which `callback` returns
      * true. Similar to Array.prototype.find in vanilla JS.
      * If no layer specified, the maps current layer is used.
      * @param callback The callback. Each tile in the given area will be passed to this callback as the first and only parameter.
      * @param context The context under which the callback should be run.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area to search. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area to search. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param layer The Tile layer to run the search on. If not provided will use the current layer.
      */
    def findTile(
      callback: FindTileCallback,
      context: js.UndefOr[js.Object],
      tileX: js.UndefOr[integer],
      tileY: js.UndefOr[integer],
      width: js.UndefOr[integer],
      height: js.UndefOr[integer],
      filteringOptions: js.UndefOr[FilteringOptions],
      layer: js.UndefOr[DynamicTilemapLayer | StaticTilemapLayer | String | integer]
    ): Tile = js.native
    /**
      * For each tile in the given rectangular area (in tile coordinates) of the layer, run the given
      * callback. Similar to Array.prototype.forEach in vanilla JS.
      * 
      * If no layer specified, the map's current layer is used.
      * @param callback The callback. Each tile in the given area will be passed to this callback as the first and only parameter.
      * @param context The context under which the callback should be run.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area to search. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area to search. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param layer The Tile layer to run the search on. If not provided will use the current layer.
      */
    def forEachTile(
      callback: EachTileCallback,
      context: js.UndefOr[js.Object],
      tileX: js.UndefOr[integer],
      tileY: js.UndefOr[integer],
      width: js.UndefOr[integer],
      height: js.UndefOr[integer],
      filteringOptions: js.UndefOr[FilteringOptions],
      layer: js.UndefOr[DynamicTilemapLayer | StaticTilemapLayer | String | integer]
    ): Tilemap = js.native
    /**
      * Gets the image layer index based on its name.
      * @param name The name of the image to get.
      */
    def getImageIndex(name: String): integer = js.native
    /**
      * Return a list of all valid imagelayer names loaded in this Tilemap.
      */
    def getImageLayerNames(): js.Array[String] = js.native
    /**
      * Internally used. Returns the index of the object in one of the Tilemaps arrays whose name
      * property matches the given `name`.
      * @param location The Tilemap array to search.
      * @param name The name of the array element to get.
      */
    def getIndex(location: js.Array[_], name: String): Double = js.native
    /**
      * Gets the LayerData from this.layers that is associated with `layer`, or null if an invalid
      * `layer` is given.
      * @param layer The name of the
      * layer from Tiled, the index of the layer in the map, a DynamicTilemapLayer or a
      * StaticTilemapLayer. If not given will default to the maps current layer index.
      */
    def getLayer(): LayerData = js.native
    def getLayer(layer: String): LayerData = js.native
    def getLayer(layer: DynamicTilemapLayer): LayerData = js.native
    def getLayer(layer: StaticTilemapLayer): LayerData = js.native
    def getLayer(layer: integer): LayerData = js.native
    /**
      * Gets the LayerData index of the given `layer` within this.layers, or null if an invalid
      * `layer` is given.
      * @param layer The name of the
      * layer from Tiled, the index of the layer in the map, a DynamicTilemapLayer or a
      * StaticTilemapLayer. If not given will default to the map's current layer index.
      */
    def getLayerIndex(): integer = js.native
    def getLayerIndex(layer: String): integer = js.native
    def getLayerIndex(layer: DynamicTilemapLayer): integer = js.native
    def getLayerIndex(layer: StaticTilemapLayer): integer = js.native
    def getLayerIndex(layer: integer): integer = js.native
    /**
      * Gets the index of the LayerData within this.layers that has the given `name`, or null if an
      * invalid `name` is given.
      * @param name The name of the layer to get.
      */
    def getLayerIndexByName(name: String): integer = js.native
    /**
      * Gets the ObjectLayer from this.objects that has the given `name`, or null if no ObjectLayer
      * is found with that name.
      * @param name The name of the object layer from Tiled.
      */
    def getObjectLayer(): ObjectLayer = js.native
    def getObjectLayer(name: String): ObjectLayer = js.native
    /**
      * Return a list of all valid objectgroup names loaded in this Tilemap.
      */
    def getObjectLayerNames(): js.Array[String] = js.native
    /**
      * Gets a tile at the given tile coordinates from the given layer.
      * If no layer specified, the map's current layer is used.
      * @param tileX X position to get the tile from (given in tile units, not pixels).
      * @param tileY Y position to get the tile from (given in tile units, not pixels).
      * @param nonNull If true getTile won't return null for empty tiles, but a Tile object with an index of -1. Default false.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def getTileAt(tileX: integer, tileY: integer): Tile = js.native
    def getTileAt(tileX: integer, tileY: integer, nonNull: Boolean): Tile = js.native
    def getTileAt(tileX: integer, tileY: integer, nonNull: Boolean, layer: String): Tile = js.native
    def getTileAt(tileX: integer, tileY: integer, nonNull: Boolean, layer: DynamicTilemapLayer): Tile = js.native
    def getTileAt(tileX: integer, tileY: integer, nonNull: Boolean, layer: StaticTilemapLayer): Tile = js.native
    def getTileAt(tileX: integer, tileY: integer, nonNull: Boolean, layer: integer): Tile = js.native
    /**
      * Gets a tile at the given world coordinates from the given layer.
      * If no layer specified, the map's current layer is used.
      * @param worldX X position to get the tile from (given in pixels)
      * @param worldY Y position to get the tile from (given in pixels)
      * @param nonNull If true, function won't return null for empty tiles, but a Tile object with an index of -1. Default false.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def getTileAtWorldXY(worldX: Double, worldY: Double): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Camera): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Camera, layer: String): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Camera, layer: DynamicTilemapLayer): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Camera, layer: StaticTilemapLayer): Tile = js.native
    def getTileAtWorldXY(worldX: Double, worldY: Double, nonNull: Boolean, camera: Camera, layer: integer): Tile = js.native
    /**
      * Return a list of all valid tilelayer names loaded in this Tilemap.
      */
    def getTileLayerNames(): js.Array[String] = js.native
    /**
      * Gets the tiles in the given rectangular area (in tile coordinates) of the layer.
      * If no layer specified, the maps current layer is used.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def getTilesWithin(
      tileX: js.UndefOr[integer],
      tileY: js.UndefOr[integer],
      width: js.UndefOr[integer],
      height: js.UndefOr[integer],
      filteringOptions: js.UndefOr[FilteringOptions],
      layer: js.UndefOr[DynamicTilemapLayer | StaticTilemapLayer | String | integer]
    ): js.Array[Tile] = js.native
    /**
      * Gets the tiles that overlap with the given shape in the given layer. The shape must be a Circle,
      * Line, Rectangle or Triangle. The shape should be in world coordinates.
      * If no layer specified, the maps current layer is used.
      * @param shape A shape in world (pixel) coordinates
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param camera The Camera to use when factoring in which tiles to return. Default main camera.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def getTilesWithinShape(shape: Circle): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Circle, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Circle, filteringOptions: FilteringOptions, camera: Camera): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Circle, filteringOptions: FilteringOptions, camera: Camera, layer: String): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Circle, filteringOptions: FilteringOptions, camera: Camera, layer: DynamicTilemapLayer): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Circle, filteringOptions: FilteringOptions, camera: Camera, layer: StaticTilemapLayer): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Circle, filteringOptions: FilteringOptions, camera: Camera, layer: integer): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Line): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Line, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Line, filteringOptions: FilteringOptions, camera: Camera): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Line, filteringOptions: FilteringOptions, camera: Camera, layer: String): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Line, filteringOptions: FilteringOptions, camera: Camera, layer: DynamicTilemapLayer): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Line, filteringOptions: FilteringOptions, camera: Camera, layer: StaticTilemapLayer): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Line, filteringOptions: FilteringOptions, camera: Camera, layer: integer): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Rectangle): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Rectangle, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Rectangle, filteringOptions: FilteringOptions, camera: Camera): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Rectangle, filteringOptions: FilteringOptions, camera: Camera, layer: String): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Rectangle, filteringOptions: FilteringOptions, camera: Camera, layer: DynamicTilemapLayer): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Rectangle, filteringOptions: FilteringOptions, camera: Camera, layer: StaticTilemapLayer): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Rectangle, filteringOptions: FilteringOptions, camera: Camera, layer: integer): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Triangle): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Triangle, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Triangle, filteringOptions: FilteringOptions, camera: Camera): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Triangle, filteringOptions: FilteringOptions, camera: Camera, layer: String): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Triangle, filteringOptions: FilteringOptions, camera: Camera, layer: DynamicTilemapLayer): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Triangle, filteringOptions: FilteringOptions, camera: Camera, layer: StaticTilemapLayer): js.Array[Tile] = js.native
    def getTilesWithinShape(shape: Triangle, filteringOptions: FilteringOptions, camera: Camera, layer: integer): js.Array[Tile] = js.native
    /**
      * Gets the tiles in the given rectangular area (in world coordinates) of the layer.
      * If no layer specified, the maps current layer is used.
      * @param worldX The world x coordinate for the top-left of the area.
      * @param worldY The world y coordinate for the top-left of the area.
      * @param width The width of the area.
      * @param height The height of the area.
      * @param filteringOptions Optional filters to apply when getting the tiles.
      * @param camera The Camera to use when factoring in which tiles to return. Default main camera.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def getTilesWithinWorldXY(worldX: Double, worldY: Double, width: Double, height: Double): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(worldX: Double, worldY: Double, width: Double, height: Double, filteringOptions: FilteringOptions): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(
      worldX: Double,
      worldY: Double,
      width: Double,
      height: Double,
      filteringOptions: FilteringOptions,
      camera: Camera
    ): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(
      worldX: Double,
      worldY: Double,
      width: Double,
      height: Double,
      filteringOptions: FilteringOptions,
      camera: Camera,
      layer: String
    ): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(
      worldX: Double,
      worldY: Double,
      width: Double,
      height: Double,
      filteringOptions: FilteringOptions,
      camera: Camera,
      layer: DynamicTilemapLayer
    ): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(
      worldX: Double,
      worldY: Double,
      width: Double,
      height: Double,
      filteringOptions: FilteringOptions,
      camera: Camera,
      layer: StaticTilemapLayer
    ): js.Array[Tile] = js.native
    def getTilesWithinWorldXY(
      worldX: Double,
      worldY: Double,
      width: Double,
      height: Double,
      filteringOptions: FilteringOptions,
      camera: Camera,
      layer: integer
    ): js.Array[Tile] = js.native
    /**
      * Gets the Tileset that has the given `name`, or null if an invalid `name` is given.
      * @param name The name of the Tileset to get.
      */
    def getTileset(name: String): Tileset = js.native
    /**
      * Gets the index of the Tileset within this.tilesets that has the given `name`, or null if an
      * invalid `name` is given.
      * @param name The name of the Tileset to get.
      */
    def getTilesetIndex(name: String): integer = js.native
    /**
      * Checks if there is a tile at the given location (in tile coordinates) in the given layer. Returns
      * false if there is no tile or if the tile at that location has an index of -1.
      * 
      * If no layer specified, the map's current layer is used.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def hasTileAt(tileX: integer, tileY: integer): Boolean = js.native
    def hasTileAt(tileX: integer, tileY: integer, layer: String): Boolean = js.native
    def hasTileAt(tileX: integer, tileY: integer, layer: DynamicTilemapLayer): Boolean = js.native
    def hasTileAt(tileX: integer, tileY: integer, layer: StaticTilemapLayer): Boolean = js.native
    def hasTileAt(tileX: integer, tileY: integer, layer: integer): Boolean = js.native
    /**
      * Checks if there is a tile at the given location (in world coordinates) in the given layer. Returns
      * false if there is no tile or if the tile at that location has an index of -1.
      * 
      * If no layer specified, the maps current layer is used.
      * @param worldX The x coordinate, in pixels.
      * @param worldY The y coordinate, in pixels.
      * @param camera The Camera to use when factoring in which tiles to return. Default main camera.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def hasTileAtWorldXY(worldX: Double, worldY: Double): Boolean = js.native
    def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Camera): Boolean = js.native
    def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Camera, layer: String): Boolean = js.native
    def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Camera, layer: DynamicTilemapLayer): Boolean = js.native
    def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Camera, layer: StaticTilemapLayer): Boolean = js.native
    def hasTileAtWorldXY(worldX: Double, worldY: Double, camera: Camera, layer: integer): Boolean = js.native
    def putTileAt(tile: Tile, tileX: integer, tileY: integer): Tile = js.native
    def putTileAt(tile: Tile, tileX: integer, tileY: integer, recalculateFaces: Boolean): Tile = js.native
    def putTileAt(tile: Tile, tileX: integer, tileY: integer, recalculateFaces: Boolean, layer: String): Tile = js.native
    def putTileAt(tile: Tile, tileX: integer, tileY: integer, recalculateFaces: Boolean, layer: DynamicTilemapLayer): Tile = js.native
    def putTileAt(tile: Tile, tileX: integer, tileY: integer, recalculateFaces: Boolean, layer: StaticTilemapLayer): Tile = js.native
    def putTileAt(tile: Tile, tileX: integer, tileY: integer, recalculateFaces: Boolean, layer: integer): Tile = js.native
    /**
      * Puts a tile at the given tile coordinates in the specified layer. You can pass in either an index
      * or a Tile object. If you pass in a Tile, all attributes will be copied over to the specified
      * location. If you pass in an index, only the index at the specified location will be changed.
      * Collision information will be recalculated at the specified location.
      * 
      * If no layer specified, the maps current layer is used.
      * 
      * This cannot be applied to StaticTilemapLayers.
      * @param tile The index of this tile to set or a Tile object.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def putTileAt(tile: integer, tileX: integer, tileY: integer): Tile = js.native
    def putTileAt(tile: integer, tileX: integer, tileY: integer, recalculateFaces: Boolean): Tile = js.native
    def putTileAt(tile: integer, tileX: integer, tileY: integer, recalculateFaces: Boolean, layer: String): Tile = js.native
    def putTileAt(
      tile: integer,
      tileX: integer,
      tileY: integer,
      recalculateFaces: Boolean,
      layer: DynamicTilemapLayer
    ): Tile = js.native
    def putTileAt(
      tile: integer,
      tileX: integer,
      tileY: integer,
      recalculateFaces: Boolean,
      layer: StaticTilemapLayer
    ): Tile = js.native
    def putTileAt(tile: integer, tileX: integer, tileY: integer, recalculateFaces: Boolean, layer: integer): Tile = js.native
    def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double): Tile = js.native
    def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double, recalculateFaces: Boolean): Tile = js.native
    def putTileAtWorldXY(tile: Tile, worldX: Double, worldY: Double, recalculateFaces: Boolean, camera: Camera): Tile = js.native
    def putTileAtWorldXY(
      tile: Tile,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: String
    ): Tile = js.native
    def putTileAtWorldXY(
      tile: Tile,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: DynamicTilemapLayer
    ): Tile = js.native
    def putTileAtWorldXY(
      tile: Tile,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: StaticTilemapLayer
    ): Tile = js.native
    def putTileAtWorldXY(
      tile: Tile,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: integer
    ): Tile = js.native
    /**
      * Puts a tile at the given world coordinates (pixels) in the specified layer. You can pass in either
      * an index or a Tile object. If you pass in a Tile, all attributes will be copied over to the
      * specified location. If you pass in an index, only the index at the specified location will be
      * changed. Collision information will be recalculated at the specified location.
      * 
      * If no layer specified, the maps current layer is used. This
      * cannot be applied to StaticTilemapLayers.
      * @param tile The index of this tile to set or a Tile object.
      * @param worldX The x coordinate, in pixels.
      * @param worldY The y coordinate, in pixels.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def putTileAtWorldXY(tile: integer, worldX: Double, worldY: Double): Tile = js.native
    def putTileAtWorldXY(tile: integer, worldX: Double, worldY: Double, recalculateFaces: Boolean): Tile = js.native
    def putTileAtWorldXY(tile: integer, worldX: Double, worldY: Double, recalculateFaces: Boolean, camera: Camera): Tile = js.native
    def putTileAtWorldXY(
      tile: integer,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: String
    ): Tile = js.native
    def putTileAtWorldXY(
      tile: integer,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: DynamicTilemapLayer
    ): Tile = js.native
    def putTileAtWorldXY(
      tile: integer,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: StaticTilemapLayer
    ): Tile = js.native
    def putTileAtWorldXY(
      tile: integer,
      worldX: Double,
      worldY: Double,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: integer
    ): Tile = js.native
    /**
      * Puts an array of tiles or a 2D array of tiles at the given tile coordinates in the specified
      * layer. The array can be composed of either tile indexes or Tile objects. If you pass in a Tile,
      * all attributes will be copied over to the specified location. If you pass in an index, only the
      * index at the specified location will be changed. Collision information will be recalculated
      * within the region tiles were changed.
      * 
      * If no layer specified, the maps current layer is used.
      * This cannot be applied to StaticTilemapLayers.
      * @param tile A row (array) or grid (2D array) of Tiles or tile indexes to place.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def putTilesAt(tile: js.Array[(js.Array[Tile | integer]) | Tile | integer], tileX: integer, tileY: integer): Tilemap = js.native
    def putTilesAt(
      tile: js.Array[(js.Array[Tile | integer]) | Tile | integer],
      tileX: integer,
      tileY: integer,
      recalculateFaces: Boolean
    ): Tilemap = js.native
    def putTilesAt(
      tile: js.Array[(js.Array[Tile | integer]) | Tile | integer],
      tileX: integer,
      tileY: integer,
      recalculateFaces: Boolean,
      layer: String
    ): Tilemap = js.native
    def putTilesAt(
      tile: js.Array[(js.Array[Tile | integer]) | Tile | integer],
      tileX: integer,
      tileY: integer,
      recalculateFaces: Boolean,
      layer: DynamicTilemapLayer
    ): Tilemap = js.native
    def putTilesAt(
      tile: js.Array[(js.Array[Tile | integer]) | Tile | integer],
      tileX: integer,
      tileY: integer,
      recalculateFaces: Boolean,
      layer: StaticTilemapLayer
    ): Tilemap = js.native
    def putTilesAt(
      tile: js.Array[(js.Array[Tile | integer]) | Tile | integer],
      tileX: integer,
      tileY: integer,
      recalculateFaces: Boolean,
      layer: integer
    ): Tilemap = js.native
    /**
      * Randomizes the indexes of a rectangular region of tiles (in tile coordinates) within the
      * specified layer. Each tile will receive a new index. If an array of indexes is passed in, then
      * those will be used for randomly assigning new tile indexes. If an array is not provided, the
      * indexes found within the region (excluding -1) will be used for randomly assigning new tile
      * indexes. This method only modifies tile indexes and does not change collision information.
      * 
      * If no layer specified, the maps current layer is used.
      * This cannot be applied to StaticTilemapLayers.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param indexes An array of indexes to randomly draw from during randomization.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def randomize(
      tileX: js.UndefOr[integer],
      tileY: js.UndefOr[integer],
      width: js.UndefOr[integer],
      height: js.UndefOr[integer],
      indexes: js.UndefOr[js.Array[integer]],
      layer: js.UndefOr[DynamicTilemapLayer | StaticTilemapLayer | String | integer]
    ): Tilemap = js.native
    /**
      * Removes all layers from this Tilemap and destroys any associated StaticTilemapLayers or
      * DynamicTilemapLayers.
      */
    def removeAllLayers(): Tilemap = js.native
    /**
      * Removes the given TilemapLayer from this Tilemap without destroying it.
      * 
      * If no layer specified, the map's current layer is used.
      * @param layer The tile layer to be removed.
      */
    def removeLayer(): Tilemap = js.native
    def removeLayer(layer: String): Tilemap = js.native
    def removeLayer(layer: DynamicTilemapLayer): Tilemap = js.native
    def removeLayer(layer: StaticTilemapLayer): Tilemap = js.native
    def removeLayer(layer: integer): Tilemap = js.native
    def removeTile(tiles: js.Array[Tile]): js.Array[Tile] = js.native
    def removeTile(tiles: js.Array[Tile], replaceIndex: integer): js.Array[Tile] = js.native
    def removeTile(tiles: js.Array[Tile], replaceIndex: integer, recalculateFaces: Boolean): js.Array[Tile] = js.native
    /**
      * Removes the given Tile, or an array of Tiles, from the layer to which they belong,
      * and optionally recalculates the collision information.
      * 
      * This cannot be applied to Tiles that belong to Static Tilemap Layers.
      * @param tiles The Tile to remove, or an array of Tiles.
      * @param replaceIndex After removing the Tile, insert a brand new Tile into its location with the given index. Leave as -1 to just remove the tile. Default -1.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      */
    def removeTile(tiles: Tile): js.Array[Tile] = js.native
    def removeTile(tiles: Tile, replaceIndex: integer): js.Array[Tile] = js.native
    def removeTile(tiles: Tile, replaceIndex: integer, recalculateFaces: Boolean): js.Array[Tile] = js.native
    /**
      * Removes the tile at the given tile coordinates in the specified layer and updates the layer's
      * collision information.
      * 
      * If no layer specified, the maps current layer is used.
      * This cannot be applied to StaticTilemapLayers.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param replaceWithNull If true, this will replace the tile at the specified location with null instead of a Tile with an index of -1. Default true.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def removeTileAt(tileX: integer, tileY: integer): Tile = js.native
    def removeTileAt(tileX: integer, tileY: integer, replaceWithNull: Boolean): Tile = js.native
    def removeTileAt(tileX: integer, tileY: integer, replaceWithNull: Boolean, recalculateFaces: Boolean): Tile = js.native
    def removeTileAt(tileX: integer, tileY: integer, replaceWithNull: Boolean, recalculateFaces: Boolean, layer: String): Tile = js.native
    def removeTileAt(
      tileX: integer,
      tileY: integer,
      replaceWithNull: Boolean,
      recalculateFaces: Boolean,
      layer: DynamicTilemapLayer
    ): Tile = js.native
    def removeTileAt(
      tileX: integer,
      tileY: integer,
      replaceWithNull: Boolean,
      recalculateFaces: Boolean,
      layer: StaticTilemapLayer
    ): Tile = js.native
    def removeTileAt(
      tileX: integer,
      tileY: integer,
      replaceWithNull: Boolean,
      recalculateFaces: Boolean,
      layer: integer
    ): Tile = js.native
    /**
      * Removes the tile at the given world coordinates in the specified layer and updates the layer's
      * collision information.
      * 
      * If no layer specified, the maps current layer is used.
      * This cannot be applied to StaticTilemapLayers.
      * @param worldX The x coordinate, in pixels.
      * @param worldY The y coordinate, in pixels.
      * @param replaceWithNull If true, this will replace the tile at the specified location with null instead of a Tile with an index of -1. Default true.
      * @param recalculateFaces `true` if the faces data should be recalculated. Default true.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def removeTileAtWorldXY(worldX: Double, worldY: Double): Tile = js.native
    def removeTileAtWorldXY(worldX: Double, worldY: Double, replaceWithNull: Boolean): Tile = js.native
    def removeTileAtWorldXY(worldX: Double, worldY: Double, replaceWithNull: Boolean, recalculateFaces: Boolean): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Boolean,
      camera: Camera
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: String
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: DynamicTilemapLayer
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: StaticTilemapLayer
    ): Tile = js.native
    def removeTileAtWorldXY(
      worldX: Double,
      worldY: Double,
      replaceWithNull: Boolean,
      recalculateFaces: Boolean,
      camera: Camera,
      layer: integer
    ): Tile = js.native
    /**
      * Draws a debug representation of the layer to the given Graphics. This is helpful when you want to
      * get a quick idea of which of your tiles are colliding and which have interesting faces. The tiles
      * are drawn starting at (0, 0) in the Graphics, allowing you to place the debug representation
      * wherever you want on the screen.
      * 
      * If no layer specified, the maps current layer is used.
      * @param graphics The target Graphics object to draw upon.
      * @param styleConfig An object specifying the colors to use for the debug drawing.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def renderDebug(graphics: Graphics, styleConfig: StyleConfig): Tilemap = js.native
    def renderDebug(graphics: Graphics, styleConfig: StyleConfig, layer: String): Tilemap = js.native
    def renderDebug(graphics: Graphics, styleConfig: StyleConfig, layer: DynamicTilemapLayer): Tilemap = js.native
    def renderDebug(graphics: Graphics, styleConfig: StyleConfig, layer: StaticTilemapLayer): Tilemap = js.native
    def renderDebug(graphics: Graphics, styleConfig: StyleConfig, layer: integer): Tilemap = js.native
    /**
      * Draws a debug representation of all layers within this Tilemap to the given Graphics object.
      * 
      * This is helpful when you want to get a quick idea of which of your tiles are colliding and which
      * have interesting faces. The tiles are drawn starting at (0, 0) in the Graphics, allowing you to
      * place the debug representation wherever you want on the screen.
      * @param graphics The target Graphics object to draw upon.
      * @param styleConfig An object specifying the colors to use for the debug drawing.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def renderDebugFull(graphics: Graphics, styleConfig: StyleConfig): Tilemap = js.native
    def renderDebugFull(graphics: Graphics, styleConfig: StyleConfig, layer: String): Tilemap = js.native
    def renderDebugFull(graphics: Graphics, styleConfig: StyleConfig, layer: DynamicTilemapLayer): Tilemap = js.native
    def renderDebugFull(graphics: Graphics, styleConfig: StyleConfig, layer: StaticTilemapLayer): Tilemap = js.native
    def renderDebugFull(graphics: Graphics, styleConfig: StyleConfig, layer: integer): Tilemap = js.native
    /**
      * Scans the given rectangular area (given in tile coordinates) for tiles with an index matching
      * `findIndex` and updates their index to match `newIndex`. This only modifies the index and does
      * not change collision information.
      * 
      * If no layer specified, the maps current layer is used.
      * This cannot be applied to StaticTilemapLayers.
      * @param findIndex The index of the tile to search for.
      * @param newIndex The index of the tile to replace it with.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def replaceByIndex(findIndex: integer, newIndex: integer): Tilemap = js.native
    def replaceByIndex(findIndex: integer, newIndex: integer, tileX: integer): Tilemap = js.native
    def replaceByIndex(findIndex: integer, newIndex: integer, tileX: integer, tileY: integer): Tilemap = js.native
    def replaceByIndex(findIndex: integer, newIndex: integer, tileX: integer, tileY: integer, width: integer): Tilemap = js.native
    def replaceByIndex(
      findIndex: integer,
      newIndex: integer,
      tileX: integer,
      tileY: integer,
      width: integer,
      height: integer
    ): Tilemap = js.native
    def replaceByIndex(
      findIndex: integer,
      newIndex: integer,
      tileX: integer,
      tileY: integer,
      width: integer,
      height: integer,
      layer: String
    ): Tilemap = js.native
    def replaceByIndex(
      findIndex: integer,
      newIndex: integer,
      tileX: integer,
      tileY: integer,
      width: integer,
      height: integer,
      layer: DynamicTilemapLayer
    ): Tilemap = js.native
    def replaceByIndex(
      findIndex: integer,
      newIndex: integer,
      tileX: integer,
      tileY: integer,
      width: integer,
      height: integer,
      layer: StaticTilemapLayer
    ): Tilemap = js.native
    def replaceByIndex(
      findIndex: integer,
      newIndex: integer,
      tileX: integer,
      tileY: integer,
      width: integer,
      height: integer,
      layer: integer
    ): Tilemap = js.native
    /**
      * Sets the base tile size for the map. Note: this does not necessarily match the tileWidth and
      * tileHeight for all layers. This also updates the base size on all tiles across all layers.
      * @param tileWidth The width of the tiles the map uses for calculations.
      * @param tileHeight The height of the tiles the map uses for calculations.
      */
    def setBaseTileSize(tileWidth: integer, tileHeight: integer): Tilemap = js.native
    def setCollision(indexes: js.Array[_]): Tilemap = js.native
    def setCollision(indexes: js.Array[_], collides: Boolean): Tilemap = js.native
    def setCollision(indexes: js.Array[_], collides: Boolean, recalculateFaces: Boolean): Tilemap = js.native
    def setCollision(indexes: js.Array[_], collides: Boolean, recalculateFaces: Boolean, layer: String): Tilemap = js.native
    def setCollision(
      indexes: js.Array[_],
      collides: Boolean,
      recalculateFaces: Boolean,
      layer: String,
      updateLayer: Boolean
    ): Tilemap = js.native
    def setCollision(indexes: js.Array[_], collides: Boolean, recalculateFaces: Boolean, layer: DynamicTilemapLayer): Tilemap = js.native
    def setCollision(
      indexes: js.Array[_],
      collides: Boolean,
      recalculateFaces: Boolean,
      layer: DynamicTilemapLayer,
      updateLayer: Boolean
    ): Tilemap = js.native
    def setCollision(indexes: js.Array[_], collides: Boolean, recalculateFaces: Boolean, layer: StaticTilemapLayer): Tilemap = js.native
    def setCollision(
      indexes: js.Array[_],
      collides: Boolean,
      recalculateFaces: Boolean,
      layer: StaticTilemapLayer,
      updateLayer: Boolean
    ): Tilemap = js.native
    def setCollision(indexes: js.Array[_], collides: Boolean, recalculateFaces: Boolean, layer: integer): Tilemap = js.native
    def setCollision(
      indexes: js.Array[_],
      collides: Boolean,
      recalculateFaces: Boolean,
      layer: integer,
      updateLayer: Boolean
    ): Tilemap = js.native
    /**
      * Sets collision on the given tile or tiles within a layer by index. You can pass in either a
      * single numeric index or an array of indexes: [2, 3, 15, 20]. The `collides` parameter controls if
      * collision will be enabled (true) or disabled (false).
      * 
      * If no layer specified, the map's current layer is used.
      * @param indexes Either a single tile index, or an array of tile indexes.
      * @param collides If true it will enable collision. If false it will clear collision. Default true.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update. Default true.
      * @param layer The tile layer to use. If not given the current layer is used.
      * @param updateLayer If true, updates the current tiles on the layer. Set to false if no tiles have been placed for significant performance boost. Default true.
      */
    def setCollision(indexes: integer): Tilemap = js.native
    def setCollision(indexes: integer, collides: Boolean): Tilemap = js.native
    def setCollision(indexes: integer, collides: Boolean, recalculateFaces: Boolean): Tilemap = js.native
    def setCollision(indexes: integer, collides: Boolean, recalculateFaces: Boolean, layer: String): Tilemap = js.native
    def setCollision(
      indexes: integer,
      collides: Boolean,
      recalculateFaces: Boolean,
      layer: String,
      updateLayer: Boolean
    ): Tilemap = js.native
    def setCollision(indexes: integer, collides: Boolean, recalculateFaces: Boolean, layer: DynamicTilemapLayer): Tilemap = js.native
    def setCollision(
      indexes: integer,
      collides: Boolean,
      recalculateFaces: Boolean,
      layer: DynamicTilemapLayer,
      updateLayer: Boolean
    ): Tilemap = js.native
    def setCollision(indexes: integer, collides: Boolean, recalculateFaces: Boolean, layer: StaticTilemapLayer): Tilemap = js.native
    def setCollision(
      indexes: integer,
      collides: Boolean,
      recalculateFaces: Boolean,
      layer: StaticTilemapLayer,
      updateLayer: Boolean
    ): Tilemap = js.native
    def setCollision(indexes: integer, collides: Boolean, recalculateFaces: Boolean, layer: integer): Tilemap = js.native
    def setCollision(
      indexes: integer,
      collides: Boolean,
      recalculateFaces: Boolean,
      layer: integer,
      updateLayer: Boolean
    ): Tilemap = js.native
    /**
      * Sets collision on a range of tiles in a layer whose index is between the specified `start` and
      * `stop` (inclusive). Calling this with a start value of 10 and a stop value of 14 would set
      * collision for tiles 10, 11, 12, 13 and 14. The `collides` parameter controls if collision will be
      * enabled (true) or disabled (false).
      * 
      * If no layer specified, the map's current layer is used.
      * @param start The first index of the tile to be set for collision.
      * @param stop The last index of the tile to be set for collision.
      * @param collides If true it will enable collision. If false it will clear collision. Default true.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update. Default true.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def setCollisionBetween(start: integer, stop: integer): Tilemap = js.native
    def setCollisionBetween(start: integer, stop: integer, collides: Boolean): Tilemap = js.native
    def setCollisionBetween(start: integer, stop: integer, collides: Boolean, recalculateFaces: Boolean): Tilemap = js.native
    def setCollisionBetween(start: integer, stop: integer, collides: Boolean, recalculateFaces: Boolean, layer: String): Tilemap = js.native
    def setCollisionBetween(
      start: integer,
      stop: integer,
      collides: Boolean,
      recalculateFaces: Boolean,
      layer: DynamicTilemapLayer
    ): Tilemap = js.native
    def setCollisionBetween(
      start: integer,
      stop: integer,
      collides: Boolean,
      recalculateFaces: Boolean,
      layer: StaticTilemapLayer
    ): Tilemap = js.native
    def setCollisionBetween(start: integer, stop: integer, collides: Boolean, recalculateFaces: Boolean, layer: integer): Tilemap = js.native
    /**
      * Sets collision on all tiles in the given layer, except for tiles that have an index specified in
      * the given array. The `collides` parameter controls if collision will be enabled (true) or
      * disabled (false).
      * 
      * If no layer specified, the map's current layer is used.
      * @param indexes An array of the tile indexes to not be counted for collision.
      * @param collides If true it will enable collision. If false it will clear collision. Default true.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update. Default true.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def setCollisionByExclusion(indexes: js.Array[integer]): Tilemap = js.native
    def setCollisionByExclusion(indexes: js.Array[integer], collides: Boolean): Tilemap = js.native
    def setCollisionByExclusion(indexes: js.Array[integer], collides: Boolean, recalculateFaces: Boolean): Tilemap = js.native
    def setCollisionByExclusion(indexes: js.Array[integer], collides: Boolean, recalculateFaces: Boolean, layer: String): Tilemap = js.native
    def setCollisionByExclusion(
      indexes: js.Array[integer],
      collides: Boolean,
      recalculateFaces: Boolean,
      layer: DynamicTilemapLayer
    ): Tilemap = js.native
    def setCollisionByExclusion(
      indexes: js.Array[integer],
      collides: Boolean,
      recalculateFaces: Boolean,
      layer: StaticTilemapLayer
    ): Tilemap = js.native
    def setCollisionByExclusion(indexes: js.Array[integer], collides: Boolean, recalculateFaces: Boolean, layer: integer): Tilemap = js.native
    /**
      * Sets collision on the tiles within a layer by checking tile properties. If a tile has a property
      * that matches the given properties object, its collision flag will be set. The `collides`
      * parameter controls if collision will be enabled (true) or disabled (false). Passing in
      * `{ collides: true }` would update the collision flag on any tiles with a "collides" property that
      * has a value of true. Any tile that doesn't have "collides" set to true will be ignored. You can
      * also use an array of values, e.g. `{ types: ["stone", "lava", "sand" ] }`. If a tile has a
      * "types" property that matches any of those values, its collision flag will be updated.
      * 
      * If no layer specified, the map's current layer is used.
      * @param properties An object with tile properties and corresponding values that should be checked.
      * @param collides If true it will enable collision. If false it will clear collision. Default true.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update. Default true.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def setCollisionByProperty(properties: js.Object): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Boolean): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Boolean): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Boolean, layer: String): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Boolean, layer: DynamicTilemapLayer): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Boolean, layer: StaticTilemapLayer): Tilemap = js.native
    def setCollisionByProperty(properties: js.Object, collides: Boolean, recalculateFaces: Boolean, layer: integer): Tilemap = js.native
    /**
      * Sets collision on the tiles within a layer by checking each tile's collision group data
      * (typically defined in Tiled within the tileset collision editor). If any objects are found within
      * a tile's collision group, the tile's colliding information will be set. The `collides` parameter
      * controls if collision will be enabled (true) or disabled (false).
      * 
      * If no layer specified, the map's current layer is used.
      * @param collides If true it will enable collision. If false it will clear collision. Default true.
      * @param recalculateFaces Whether or not to recalculate the tile faces after the update. Default true.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def setCollisionFromCollisionGroup(): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Boolean): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Boolean): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Boolean, layer: String): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Boolean, layer: DynamicTilemapLayer): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Boolean, layer: StaticTilemapLayer): Tilemap = js.native
    def setCollisionFromCollisionGroup(collides: Boolean, recalculateFaces: Boolean, layer: integer): Tilemap = js.native
    /**
      * Sets the current layer to the LayerData associated with `layer`.
      * @param layer The name of the
      * layer from Tiled, the index of the layer in the map, a DynamicTilemapLayer or a
      * StaticTilemapLayer. If not given will default to the map's current layer index.
      */
    def setLayer(): Tilemap = js.native
    def setLayer(layer: String): Tilemap = js.native
    def setLayer(layer: DynamicTilemapLayer): Tilemap = js.native
    def setLayer(layer: StaticTilemapLayer): Tilemap = js.native
    def setLayer(layer: integer): Tilemap = js.native
    /**
      * Sets the tile size for a specific `layer`. Note: this does not necessarily match the map's
      * tileWidth and tileHeight for all layers. This will set the tile size for the layer and any
      * tiles the layer has.
      * @param tileWidth The width of the tiles (in pixels) in the layer.
      * @param tileHeight The height of the tiles (in pixels) in the layer.
      * @param layer The name of the
      * layer from Tiled, the index of the layer in the map, a DynamicTilemapLayer or a
      * StaticTilemapLayer. If not given will default to the map's current layer index.
      */
    def setLayerTileSize(tileWidth: integer, tileHeight: integer): Tilemap = js.native
    def setLayerTileSize(tileWidth: integer, tileHeight: integer, layer: String): Tilemap = js.native
    def setLayerTileSize(tileWidth: integer, tileHeight: integer, layer: DynamicTilemapLayer): Tilemap = js.native
    def setLayerTileSize(tileWidth: integer, tileHeight: integer, layer: StaticTilemapLayer): Tilemap = js.native
    def setLayerTileSize(tileWidth: integer, tileHeight: integer, layer: integer): Tilemap = js.native
    def setRenderOrder(renderOrder: String): this.type = js.native
    /**
      * Sets the rendering (draw) order of the tiles in this map.
      * 
      * The default is 'right-down', meaning it will order the tiles starting from the top-left,
      * drawing to the right and then moving down to the next row.
      * 
      * The draw orders are:
      * 
      * 0 = right-down
      * 1 = left-down
      * 2 = right-up
      * 3 = left-up
      * 
      * Setting the render order does not change the tiles or how they are stored in the layer,
      * it purely impacts the order in which they are rendered.
      * 
      * You can provide either an integer (0 to 3), or the string version of the order.
      * 
      * Calling this method _after_ creating Static or Dynamic Tilemap Layers will **not** automatically
      * update them to use the new render order. If you call this method after creating layers, use their
      * own `setRenderOrder` methods to change them as needed.
      * @param renderOrder The render (draw) order value. Either an integer between 0 and 3, or a string: 'right-down', 'left-down', 'right-up' or 'left-up'.
      */
    def setRenderOrder(renderOrder: integer): this.type = js.native
    def setTileIndexCallback(indexes: js.Array[_], callback: js.Function, callbackContext: js.Object): Tilemap = js.native
    def setTileIndexCallback(indexes: js.Array[_], callback: js.Function, callbackContext: js.Object, layer: String): Tilemap = js.native
    def setTileIndexCallback(
      indexes: js.Array[_],
      callback: js.Function,
      callbackContext: js.Object,
      layer: DynamicTilemapLayer
    ): Tilemap = js.native
    def setTileIndexCallback(indexes: js.Array[_], callback: js.Function, callbackContext: js.Object, layer: StaticTilemapLayer): Tilemap = js.native
    def setTileIndexCallback(indexes: js.Array[_], callback: js.Function, callbackContext: js.Object, layer: integer): Tilemap = js.native
    /**
      * Sets a global collision callback for the given tile index within the layer. This will affect all
      * tiles on this layer that have the same index. If a callback is already set for the tile index it
      * will be replaced. Set the callback to null to remove it. If you want to set a callback for a tile
      * at a specific location on the map then see setTileLocationCallback.
      * 
      * If no layer specified, the map's current layer is used.
      * @param indexes Either a single tile index, or an array of tile indexes to have a collision callback set for.
      * @param callback The callback that will be invoked when the tile is collided with.
      * @param callbackContext The context under which the callback is called.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def setTileIndexCallback(indexes: integer, callback: js.Function, callbackContext: js.Object): Tilemap = js.native
    def setTileIndexCallback(indexes: integer, callback: js.Function, callbackContext: js.Object, layer: String): Tilemap = js.native
    def setTileIndexCallback(indexes: integer, callback: js.Function, callbackContext: js.Object, layer: DynamicTilemapLayer): Tilemap = js.native
    def setTileIndexCallback(indexes: integer, callback: js.Function, callbackContext: js.Object, layer: StaticTilemapLayer): Tilemap = js.native
    def setTileIndexCallback(indexes: integer, callback: js.Function, callbackContext: js.Object, layer: integer): Tilemap = js.native
    /**
      * Sets a collision callback for the given rectangular area (in tile coordinates) within the layer.
      * If a callback is already set for the tile index it will be replaced. Set the callback to null to
      * remove it.
      * 
      * If no layer specified, the map's current layer is used.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area.
      * @param width How many tiles wide from the `tileX` index the area will be.
      * @param height How many tiles tall from the `tileY` index the area will be.
      * @param callback The callback that will be invoked when the tile is collided with.
      * @param callbackContext The context under which the callback is called.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def setTileLocationCallback(tileX: integer, tileY: integer, width: integer, height: integer, callback: js.Function): Tilemap = js.native
    def setTileLocationCallback(
      tileX: integer,
      tileY: integer,
      width: integer,
      height: integer,
      callback: js.Function,
      callbackContext: js.Object
    ): Tilemap = js.native
    def setTileLocationCallback(
      tileX: integer,
      tileY: integer,
      width: integer,
      height: integer,
      callback: js.Function,
      callbackContext: js.Object,
      layer: String
    ): Tilemap = js.native
    def setTileLocationCallback(
      tileX: integer,
      tileY: integer,
      width: integer,
      height: integer,
      callback: js.Function,
      callbackContext: js.Object,
      layer: DynamicTilemapLayer
    ): Tilemap = js.native
    def setTileLocationCallback(
      tileX: integer,
      tileY: integer,
      width: integer,
      height: integer,
      callback: js.Function,
      callbackContext: js.Object,
      layer: StaticTilemapLayer
    ): Tilemap = js.native
    def setTileLocationCallback(
      tileX: integer,
      tileY: integer,
      width: integer,
      height: integer,
      callback: js.Function,
      callbackContext: js.Object,
      layer: integer
    ): Tilemap = js.native
    /**
      * Shuffles the tiles in a rectangular region (specified in tile coordinates) within the given
      * layer. It will only randomize the tiles in that area, so if they're all the same nothing will
      * appear to have changed! This method only modifies tile indexes and does not change collision
      * information.
      * 
      * If no layer specified, the maps current layer is used.
      * This cannot be applied to StaticTilemapLayers.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def shuffle(): Tilemap = js.native
    def shuffle(tileX: integer): Tilemap = js.native
    def shuffle(tileX: integer, tileY: integer): Tilemap = js.native
    def shuffle(tileX: integer, tileY: integer, width: integer): Tilemap = js.native
    def shuffle(tileX: integer, tileY: integer, width: integer, height: integer): Tilemap = js.native
    def shuffle(tileX: integer, tileY: integer, width: integer, height: integer, layer: String): Tilemap = js.native
    def shuffle(tileX: integer, tileY: integer, width: integer, height: integer, layer: DynamicTilemapLayer): Tilemap = js.native
    def shuffle(tileX: integer, tileY: integer, width: integer, height: integer, layer: StaticTilemapLayer): Tilemap = js.native
    def shuffle(tileX: integer, tileY: integer, width: integer, height: integer, layer: integer): Tilemap = js.native
    /**
      * Scans the given rectangular area (given in tile coordinates) for tiles with an index matching
      * `indexA` and swaps then with `indexB`. This only modifies the index and does not change collision
      * information.
      * 
      * If no layer specified, the maps current layer is used.
      * This cannot be applied to StaticTilemapLayers.
      * @param tileA First tile index.
      * @param tileB Second tile index.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def swapByIndex(tileA: integer, tileB: integer): Tilemap = js.native
    def swapByIndex(tileA: integer, tileB: integer, tileX: integer): Tilemap = js.native
    def swapByIndex(tileA: integer, tileB: integer, tileX: integer, tileY: integer): Tilemap = js.native
    def swapByIndex(tileA: integer, tileB: integer, tileX: integer, tileY: integer, width: integer): Tilemap = js.native
    def swapByIndex(tileA: integer, tileB: integer, tileX: integer, tileY: integer, width: integer, height: integer): Tilemap = js.native
    def swapByIndex(
      tileA: integer,
      tileB: integer,
      tileX: integer,
      tileY: integer,
      width: integer,
      height: integer,
      layer: String
    ): Tilemap = js.native
    def swapByIndex(
      tileA: integer,
      tileB: integer,
      tileX: integer,
      tileY: integer,
      width: integer,
      height: integer,
      layer: DynamicTilemapLayer
    ): Tilemap = js.native
    def swapByIndex(
      tileA: integer,
      tileB: integer,
      tileX: integer,
      tileY: integer,
      width: integer,
      height: integer,
      layer: StaticTilemapLayer
    ): Tilemap = js.native
    def swapByIndex(
      tileA: integer,
      tileB: integer,
      tileX: integer,
      tileY: integer,
      width: integer,
      height: integer,
      layer: integer
    ): Tilemap = js.native
    /**
      * Converts from tile X coordinates (tile units) to world X coordinates (pixels), factoring in the
      * layers position, scale and scroll.
      * 
      * If no layer specified, the maps current layer is used.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def tileToWorldX(tileX: integer): Double = js.native
    def tileToWorldX(tileX: integer, camera: Camera): Double = js.native
    def tileToWorldX(tileX: integer, camera: Camera, layer: String): Double = js.native
    def tileToWorldX(tileX: integer, camera: Camera, layer: DynamicTilemapLayer): Double = js.native
    def tileToWorldX(tileX: integer, camera: Camera, layer: StaticTilemapLayer): Double = js.native
    def tileToWorldX(tileX: integer, camera: Camera, layer: integer): Double = js.native
    /**
      * Converts from tile XY coordinates (tile units) to world XY coordinates (pixels), factoring in the
      * layers position, scale and scroll. This will return a new Vector2 object or update the given
      * `point` object.
      * 
      * If no layer specified, the maps current layer is used.
      * @param tileX The x coordinate, in tiles, not pixels.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param point A Vector2 to store the coordinates in. If not given a new Vector2 is created.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def tileToWorldXY(tileX: integer, tileY: integer): Vector2 = js.native
    def tileToWorldXY(tileX: integer, tileY: integer, point: Vector2): Vector2 = js.native
    def tileToWorldXY(tileX: integer, tileY: integer, point: Vector2, camera: Camera): Vector2 = js.native
    def tileToWorldXY(tileX: integer, tileY: integer, point: Vector2, camera: Camera, layer: String): Vector2 = js.native
    def tileToWorldXY(tileX: integer, tileY: integer, point: Vector2, camera: Camera, layer: DynamicTilemapLayer): Vector2 = js.native
    def tileToWorldXY(tileX: integer, tileY: integer, point: Vector2, camera: Camera, layer: StaticTilemapLayer): Vector2 = js.native
    def tileToWorldXY(tileX: integer, tileY: integer, point: Vector2, camera: Camera, layer: integer): Vector2 = js.native
    /**
      * Converts from tile Y coordinates (tile units) to world Y coordinates (pixels), factoring in the
      * layers position, scale and scroll.
      * 
      * If no layer specified, the maps current layer is used.
      * @param tileY The y coordinate, in tiles, not pixels.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      * @param layer The tile layer
      * to use. If not given the current layer is used.
      */
    def tileToWorldY(tileY: integer): Double = js.native
    def tileToWorldY(tileY: integer, camera: Camera): Double = js.native
    def tileToWorldY(tileY: integer, camera: Camera, layer: String): Double = js.native
    def tileToWorldY(tileY: integer, camera: Camera, layer: DynamicTilemapLayer): Double = js.native
    def tileToWorldY(tileY: integer, camera: Camera, layer: StaticTilemapLayer): Double = js.native
    def tileToWorldY(tileY: integer, camera: Camera, layer: integer): Double = js.native
    /**
      * Randomizes the indexes of a rectangular region of tiles (in tile coordinates) within the
      * specified layer. Each tile will receive a new index. New indexes are drawn from the given
      * weightedIndexes array. An example weighted array:
      * 
      * [
      *  { index: 6, weight: 4 },    // Probability of index 6 is 4 / 8
      *  { index: 7, weight: 2 },    // Probability of index 7 would be 2 / 8
      *  { index: 8, weight: 1.5 },  // Probability of index 8 would be 1.5 / 8
      *  { index: 26, weight: 0.5 }  // Probability of index 27 would be 0.5 / 8
      * ]
      * 
      * The probability of any index being choose is (the index's weight) / (sum of all weights). This
      * method only modifies tile indexes and does not change collision information.
      * 
      * If no layer specified, the map's current layer is used. This
      * cannot be applied to StaticTilemapLayers.
      * @param tileX The left most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param tileY The top most tile index (in tile coordinates) to use as the origin of the area. Default 0.
      * @param width How many tiles wide from the `tileX` index the area will be. Default max width based on tileX.
      * @param height How many tiles tall from the `tileY` index the area will be. Default max height based on tileY.
      * @param weightedIndexes An array of objects to randomly draw from during
      * randomization. They should be in the form: { index: 0, weight: 4 } or
      * { index: [0, 1], weight: 4 } if you wish to draw from multiple tile indexes.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def weightedRandomize(
      tileX: js.UndefOr[integer],
      tileY: js.UndefOr[integer],
      width: js.UndefOr[integer],
      height: js.UndefOr[integer],
      weightedIndexes: js.UndefOr[js.Array[js.Object]],
      layer: js.UndefOr[DynamicTilemapLayer | StaticTilemapLayer | String | integer]
    ): Tilemap = js.native
    /**
      * Converts from world X coordinates (pixels) to tile X coordinates (tile units), factoring in the
      * layers position, scale and scroll.
      * 
      * If no layer specified, the maps current layer is used.
      * @param worldX The x coordinate to be converted, in pixels, not tiles.
      * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer. Default true.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      * @param layer The tile layer
      * to use. If not given the current layer is used.
      */
    def worldToTileX(worldX: Double): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Boolean): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Camera): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Camera, layer: String): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Camera, layer: DynamicTilemapLayer): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Camera, layer: StaticTilemapLayer): Double = js.native
    def worldToTileX(worldX: Double, snapToFloor: Boolean, camera: Camera, layer: integer): Double = js.native
    /**
      * Converts from world XY coordinates (pixels) to tile XY coordinates (tile units), factoring in the
      * layers position, scale and scroll. This will return a new Vector2 object or update the given
      * `point` object.
      * 
      * If no layer specified, the maps current layer is used.
      * @param worldX The x coordinate to be converted, in pixels, not tiles.
      * @param worldY The y coordinate to be converted, in pixels, not tiles.
      * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer. Default true.
      * @param point A Vector2 to store the coordinates in. If not given a new Vector2 is created.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def worldToTileXY(worldX: Double, worldY: Double): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, point: Vector2): Vector2 = js.native
    def worldToTileXY(worldX: Double, worldY: Double, snapToFloor: Boolean, point: Vector2, camera: Camera): Vector2 = js.native
    def worldToTileXY(
      worldX: Double,
      worldY: Double,
      snapToFloor: Boolean,
      point: Vector2,
      camera: Camera,
      layer: String
    ): Vector2 = js.native
    def worldToTileXY(
      worldX: Double,
      worldY: Double,
      snapToFloor: Boolean,
      point: Vector2,
      camera: Camera,
      layer: DynamicTilemapLayer
    ): Vector2 = js.native
    def worldToTileXY(
      worldX: Double,
      worldY: Double,
      snapToFloor: Boolean,
      point: Vector2,
      camera: Camera,
      layer: StaticTilemapLayer
    ): Vector2 = js.native
    def worldToTileXY(
      worldX: Double,
      worldY: Double,
      snapToFloor: Boolean,
      point: Vector2,
      camera: Camera,
      layer: integer
    ): Vector2 = js.native
    /**
      * Converts from world Y coordinates (pixels) to tile Y coordinates (tile units), factoring in the
      * layers position, scale and scroll.
      * 
      * If no layer specified, the maps current layer is used.
      * @param worldY The y coordinate to be converted, in pixels, not tiles.
      * @param snapToFloor Whether or not to round the tile coordinate down to the nearest integer. Default true.
      * @param camera The Camera to use when calculating the tile index from the world values. Default main camera.
      * @param layer The tile layer to use. If not given the current layer is used.
      */
    def worldToTileY(worldY: Double): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Boolean): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Camera): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Camera, layer: String): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Camera, layer: DynamicTilemapLayer): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Camera, layer: StaticTilemapLayer): Double = js.native
    def worldToTileY(worldY: Double, snapToFloor: Boolean, camera: Camera, layer: integer): Double = js.native
  }
  
  /**
    * A Tileset is a combination of an image containing the tiles and a container for data about
    * each tile.
    */
  @js.native
  class Tileset protected () extends js.Object {
    /**
      * 
      * @param name The name of the tileset in the map data.
      * @param firstgid The first tile index this tileset contains.
      * @param tileWidth Width of each tile (in pixels). Default 32.
      * @param tileHeight Height of each tile (in pixels). Default 32.
      * @param tileMargin The margin around all tiles in the sheet (in pixels). Default 0.
      * @param tileSpacing The spacing between each tile in the sheet (in pixels). Default 0.
      * @param tileProperties Custom properties defined per tile in the Tileset.
      * These typically are custom properties created in Tiled when editing a tileset. Default {}.
      * @param tileData Data stored per tile. These typically are created in Tiled
      * when editing a tileset, e.g. from Tiled's tile collision editor or terrain editor. Default {}.
      */
    def this(
      name: String,
      firstgid: integer,
      tileWidth: js.UndefOr[integer],
      tileHeight: js.UndefOr[integer],
      tileMargin: js.UndefOr[integer],
      tileSpacing: js.UndefOr[integer],
      tileProperties: js.UndefOr[js.Object],
      tileData: js.UndefOr[js.Object]
    ) = this()
    /**
      * The number of tile columns in the tileset.
      */
    val columns: integer = js.native
    /**
      * The starting index of the first tile index this Tileset contains.
      */
    var firstgid: integer = js.native
    /**
      * The gl texture used by the WebGL renderer.
      */
    val glTexture: WebGLTexture = js.native
    /**
      * The cached image that contains the individual tiles. Use setImage to set.
      */
    val image: Texture = js.native
    /**
      * The name of the Tileset.
      */
    var name: String = js.native
    /**
      * The number of tile rows in the the tileset.
      */
    val rows: integer = js.native
    /**
      * The look-up table to specific tile image texture coordinates (UV in pixels). Each element
      * contains the coordinates for a tile in an object of the form {x, y}.
      */
    val texCoordinates: js.Array[js.Object] = js.native
    /**
      * Tileset-specific data per tile that are typically defined in the Tiled editor, e.g. within
      * the Tileset collision editor. This is where collision objects and terrain are stored.
      */
    var tileData: js.Object = js.native
    /**
      * The height of each tile (in pixels). Use setTileSize to change.
      */
    val tileHeight: integer = js.native
    /**
      * The margin around the tiles in the sheet (in pixels). Use `setSpacing` to change.
      */
    val tileMargin: integer = js.native
    /**
      * Tileset-specific properties per tile that are typically defined in the Tiled editor in the
      * Tileset editor.
      */
    var tileProperties: js.Object = js.native
    /**
      * The spacing between each the tile in the sheet (in pixels). Use `setSpacing` to change.
      */
    val tileSpacing: integer = js.native
    /**
      * The width of each tile (in pixels). Use setTileSize to change.
      */
    val tileWidth: integer = js.native
    /**
      * The total number of tiles in the tileset.
      */
    val total: integer = js.native
    /**
      * Returns true if and only if this Tileset contains the given tile index.
      * @param tileIndex The unique id of the tile across all tilesets in the map.
      */
    def containsTileIndex(tileIndex: integer): Boolean = js.native
    /**
      * Get a tile's collision group that is stored in the Tileset. Returns null if tile index is not
      * contained in this Tileset. This is typically defined within Tiled's tileset collision editor.
      * @param tileIndex The unique id of the tile across all tilesets in the map.
      */
    def getTileCollisionGroup(tileIndex: integer): js.Object = js.native
    /**
      * Get a tile's data that is stored in the Tileset. Returns null if tile index is not contained
      * in this Tileset. This is typically defined in Tiled and will contain both Tileset collision
      * info and terrain mapping.
      * @param tileIndex The unique id of the tile across all tilesets in the map.
      */
    def getTileData(tileIndex: integer): js.UndefOr[js.Object] = js.native
    /**
      * Get a tiles properties that are stored in the Tileset. Returns null if tile index is not
      * contained in this Tileset. This is typically defined in Tiled under the Tileset editor.
      * @param tileIndex The unique id of the tile across all tilesets in the map.
      */
    def getTileProperties(tileIndex: integer): js.UndefOr[js.Object] = js.native
    /**
      * Returns the texture coordinates (UV in pixels) in the Tileset image for the given tile index.
      * Returns null if tile index is not contained in this Tileset.
      * @param tileIndex The unique id of the tile across all tilesets in the map.
      */
    def getTileTextureCoordinates(tileIndex: integer): js.Object = js.native
    /**
      * Sets the image associated with this Tileset and updates the tile data (rows, columns, etc.).
      * @param texture The image that contains the tiles.
      */
    def setImage(texture: Texture): Tileset = js.native
    /**
      * Sets the tile margin & spacing and updates the tile data (rows, columns, etc.).
      * @param margin The margin around the tiles in the sheet (in pixels).
      * @param spacing The spacing between the tiles in the sheet (in pixels).
      */
    def setSpacing(): Tileset = js.native
    def setSpacing(margin: integer): Tileset = js.native
    def setSpacing(margin: integer, spacing: integer): Tileset = js.native
    /**
      * Sets the tile width & height and updates the tile data (rows, columns, etc.).
      * @param tileWidth The width of a tile in pixels.
      * @param tileHeight The height of a tile in pixels.
      */
    def setTileSize(): Tileset = js.native
    def setTileSize(tileWidth: integer): Tileset = js.native
    def setTileSize(tileWidth: integer, tileHeight: integer): Tileset = js.native
    /**
      * Updates tile texture coordinates and tileset data.
      * @param imageWidth The (expected) width of the image to slice.
      * @param imageHeight The (expected) height of the image to slice.
      */
    def updateTileData(imageWidth: integer, imageHeight: integer): Tileset = js.native
  }
  
  /**
    * Create a Tilemap from the given key or data. If neither is given, make a blank Tilemap. When
    * loading from CSV or a 2D array, you should specify the tileWidth & tileHeight. When parsing from
    * a map from Tiled, the tileWidth, tileHeight, width & height will be pulled from the map data. For
    * an empty map, you should specify tileWidth, tileHeight, width & height.
    * @param scene The Scene to which this Tilemap belongs.
    * @param key The key in the Phaser cache that corresponds to the loaded tilemap data.
    * @param tileWidth The width of a tile in pixels. Default 32.
    * @param tileHeight The height of a tile in pixels. Default 32.
    * @param width The width of the map in tiles. Default 10.
    * @param height The height of the map in tiles. Default 10.
    * @param data Instead of loading from the cache, you can also load directly from
    * a 2D array of tile indexes.
    * @param insertNull Controls how empty tiles, tiles with an index of -1, in the
    * map data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
    * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
    * the tile data doesn't need to change then setting this value to `true` will help with memory
    * consumption. However if your map is small or you need to update the tiles dynamically, then leave
    * the default value set. Default false.
    */
  def ParseToTilemap(
    scene: Scene,
    key: js.UndefOr[String],
    tileWidth: js.UndefOr[integer],
    tileHeight: js.UndefOr[integer],
    width: js.UndefOr[integer],
    height: js.UndefOr[integer],
    data: js.UndefOr[js.Array[js.Array[integer]]],
    insertNull: js.UndefOr[Boolean]
  ): Tilemap = js.native
  @js.native
  object Formats extends js.Object {
    /**
      * 2D Array Map Type
      */
    var ARRAY_2D: Double = js.native
    /**
      * CSV Map Type
      */
    var CSV: Double = js.native
    /**
      * Tiled JSON Map Type
      */
    var TILED_JSON: Double = js.native
    /**
      * Weltmeister (Impact.js) Map Type
      */
    var WELTMEISTER: Double = js.native
  }
  
  @js.native
  object Parsers extends js.Object {
    def Parse(
      name: String,
      mapFormat: integer,
      data: String,
      tileWidth: integer,
      tileHeight: integer,
      insertNull: Boolean
    ): MapData = js.native
    /**
      * Parses raw data of a given Tilemap format into a new MapData object. If no recognized data format
      * is found, returns `null`. When loading from CSV or a 2D array, you should specify the tileWidth &
      * tileHeight. When parsing from a map from Tiled, the tileWidth & tileHeight will be pulled from
      * the map data.
      * @param name The name of the tilemap, used to set the name on the MapData.
      * @param mapFormat See ../Formats.js.
      * @param data 2D array, CSV string or Tiled JSON object.
      * @param tileWidth The width of a tile in pixels. Required for 2D array and CSV, but
      * ignored for Tiled JSON.
      * @param tileHeight The height of a tile in pixels. Required for 2D array and CSV, but
      * ignored for Tiled JSON.
      * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
      * data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
      * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
      * the tile data doesn't need to change then setting this value to `true` will help with memory
      * consumption. However if your map is small or you need to update the tiles dynamically, then leave
      * the default value set.
      */
    def Parse(
      name: String,
      mapFormat: integer,
      data: js.Array[js.Array[integer]],
      tileWidth: integer,
      tileHeight: integer,
      insertNull: Boolean
    ): MapData = js.native
    def Parse(
      name: String,
      mapFormat: integer,
      data: js.Object,
      tileWidth: integer,
      tileHeight: integer,
      insertNull: Boolean
    ): MapData = js.native
    /**
      * Parses a 2D array of tile indexes into a new MapData object with a single layer.
      * @param name The name of the tilemap, used to set the name on the MapData.
      * @param data 2D array, CSV string or Tiled JSON object.
      * @param tileWidth The width of a tile in pixels.
      * @param tileHeight The height of a tile in pixels.
      * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
      * data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
      * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
      * the tile data doesn't need to change then setting this value to `true` will help with memory
      * consumption. However if your map is small or you need to update the tiles dynamically, then leave
      * the default value set.
      */
    def Parse2DArray(
      name: String,
      data: js.Array[js.Array[integer]],
      tileWidth: integer,
      tileHeight: integer,
      insertNull: Boolean
    ): MapData = js.native
    /**
      * Parses a CSV string of tile indexes into a new MapData object with a single layer.
      * @param name The name of the tilemap, used to set the name on the MapData.
      * @param data CSV string of tile indexes.
      * @param tileWidth The width of a tile in pixels.
      * @param tileHeight The height of a tile in pixels.
      * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
      * data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
      * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
      * the tile data doesn't need to change then setting this value to `true` will help with memory
      * consumption. However if your map is small or you need to update the tiles dynamically, then leave
      * the default value set.
      */
    def ParseCSV(name: String, data: String, tileWidth: integer, tileHeight: integer, insertNull: Boolean): MapData = js.native
    @js.native
    object Impact extends js.Object {
      /**
        * [description]
        * @param json [description]
        * @param insertNull [description]
        */
      def ParseTileLayers(json: js.Object, insertNull: Boolean): js.Array[_] = js.native
      /**
        * [description]
        * @param json [description]
        */
      def ParseTilesets(json: js.Object): js.Array[_] = js.native
      /**
        * Parses a Weltmeister JSON object into a new MapData object.
        * @param name The name of the tilemap, used to set the name on the MapData.
        * @param json The Weltmeister JSON object.
        * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
        * data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
        * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
        * the tile data doesn't need to change then setting this value to `true` will help with memory
        * consumption. However if your map is small or you need to update the tiles dynamically, then leave
        * the default value set.
        */
      def ParseWeltmeister(name: String, json: js.Object, insertNull: Boolean): js.Object = js.native
    }
    
    @js.native
    object Tiled extends js.Object {
      /**
        * Copy properties from tileset to tiles.
        * @param mapData [description]
        */
      def AssignTileProperties(mapData: MapData): Unit = js.native
      /**
        * Decode base-64 encoded data, for example as exported by Tiled.
        * @param data Base-64 encoded data to decode.
        */
      def Base64Decode(data: js.Object): js.Array[_] = js.native
      /**
        * Master list of tiles -> x, y, index in tileset.
        * @param mapData [description]
        */
      def BuildTilesetIndex(mapData: MapData): js.Array[_] = js.native
      /**
        * Parse a Tiled group layer and create a state object for inheriting.
        * @param json The Tiled JSON object.
        * @param currentl The current group layer from the Tiled JSON file.
        * @param parentstate The state of the parent group (if any).
        */
      def CreateGroupLayer(json: js.Object): js.Object = js.native
      def CreateGroupLayer(json: js.Object, currentl: js.Object): js.Object = js.native
      def CreateGroupLayer(json: js.Object, currentl: js.Object, parentstate: js.Object): js.Object = js.native
      /**
        * See Tiled documentation on tile flipping:
        * http://docs.mapeditor.org/en/latest/reference/tmx-map-format/
        * @param gid [description]
        */
      def ParseGID(gid: Double): js.Object = js.native
      /**
        * Parses a Tiled JSON object into an array of objects with details about the image layers.
        * @param json The Tiled JSON object.
        */
      def ParseImageLayers(json: js.Object): js.Array[_] = js.native
      /**
        * Parses a Tiled JSON object into a new MapData object.
        * @param name The name of the tilemap, used to set the name on the MapData.
        * @param json The Tiled JSON object.
        * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
        * data are handled. If `true`, empty locations will get a value of `null`. If `false`, empty
        * location will get a Tile object with an index of -1. If you've a large sparsely populated map and
        * the tile data doesn't need to change then setting this value to `true` will help with memory
        * consumption. However if your map is small or you need to update the tiles dynamically, then leave
        * the default value set.
        */
      def ParseJSONTiled(name: String, json: js.Object, insertNull: Boolean): MapData = js.native
      /**
        * Convert a Tiled object to an internal parsed object normalising and copying properties over, while applying optional x and y offsets. The parsed object will always have the properties `id`, `name`, `type`, `rotation`, `properties`, `visible`, `x`, `y`, `width` and `height`. Other properties will be added according to the object type (such as text, polyline, gid etc.)
        * @param tiledObject Tiled object to convert to an internal parsed object normalising and copying properties over.
        * @param offsetX Optional additional offset to apply to the object's x property. Defaults to 0. Default 0.
        * @param offsetY Optional additional offset to apply to the object's y property. Defaults to 0. Default 0.
        */
      def ParseObject(tiledObject: js.Object): js.Object = js.native
      def ParseObject(tiledObject: js.Object, offsetX: Double): js.Object = js.native
      def ParseObject(tiledObject: js.Object, offsetX: Double, offsetY: Double): js.Object = js.native
      /**
        * Parses a Tiled JSON object into an array of ObjectLayer objects.
        * @param json The Tiled JSON object.
        */
      def ParseObjectLayers(json: js.Object): js.Array[_] = js.native
      /**
        * Parses all tilemap layers in a Tiled JSON object into new LayerData objects.
        * @param json The Tiled JSON object.
        * @param insertNull Controls how empty tiles, tiles with an index of -1, in the map
        * data are handled (see {@link Phaser.Tilemaps.Parsers.Tiled.ParseJSONTiled}).
        */
      def ParseTileLayers(json: js.Object, insertNull: Boolean): js.Array[LayerData] = js.native
      /**
        * Tilesets and Image Collections
        * @param json [description]
        */
      def ParseTilesets(json: js.Object): js.Object = js.native
    }
    
  }
  
}

