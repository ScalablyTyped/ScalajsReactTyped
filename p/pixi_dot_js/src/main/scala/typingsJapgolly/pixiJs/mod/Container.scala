package typingsJapgolly.pixiJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Container represents a collection of display objects.
  *
  * It is the base class of all display objects that act as a container for other objects (like Sprites).
  *
  *```js
  * let container = new PIXI.Container();
  * container.addChild(sprite);
  * ```
  *
  * @class
  * @extends PIXI.DisplayObject
  * @memberof PIXI
  */
@JSImport("pixi.js", "Container")
@js.native
class Container ()
  extends typingsJapgolly.pixiJs.PIXI.Container

