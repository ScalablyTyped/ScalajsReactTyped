package typingsJapgolly.playcanvas.global.pc

import typingsJapgolly.playcanvas.mod.AppBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Loads files that contain multiple resources. For example glTF files can contain textures, models
  * and animations.
  *
  * For glTF files, the asset options object can be used to pass load time callbacks for handling
  * the various resources at different stages of loading. The table below lists the resource types
  * and the corresponding supported process functions.
  *
  * ```
  * |---------------------------------------------------------------------|
  * |  resource   |  preprocess |   process   |processAsync | postprocess |
  * |-------------+-------------+-------------+-------------+-------------|
  * | global      |      x      |             |             |      x      |
  * | node        |      x      |      x      |             |      x      |
  * | light       |      x      |      x      |             |      x      |
  * | camera      |      x      |      x      |             |      x      |
  * | animation   |      x      |             |             |      x      |
  * | material    |      x      |      x      |             |      x      |
  * | image       |      x      |             |      x      |      x      |
  * | texture     |      x      |             |      x      |      x      |
  * | buffer      |      x      |             |      x      |      x      |
  * | bufferView  |      x      |             |      x      |      x      |
  * |---------------------------------------------------------------------|
  * ```
  *
  * Additional options that can be passed for glTF files:
  * [options.morphPreserveData] - When true, the morph target keeps its data passed using the options,
  * allowing the clone operation.
  *
  * For example, to receive a texture preprocess callback:
  *
  * ```javascript
  * var containerAsset = new pc.Asset(filename, 'container', { url: url, filename: filename }, null, {
  *     texture: {
  *         preprocess(gltfTexture) { console.log("texture preprocess"); }
  *     },
  * });
  * ```
  *
  * @implements {ResourceHandler}
  */
@JSGlobal("pc.ContainerHandler")
@js.native
open class ContainerHandler protected ()
  extends typingsJapgolly.playcanvas.mod.ContainerHandler {
  /**
    * Create a new ContainerResource instance.
    *
    * @param {AppBase} app - The running {@link AppBase}.
    * @hideconstructor
    */
  def this(app: AppBase) = this()
}
