package typingsJapgolly.phaser

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.phaser.spine.AssetManager
import typingsJapgolly.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofAssetManager
  extends Instantiable1[
      /* textureLoader */ js.Function1[/* image */ HTMLImageElement, js.Any], 
      AssetManager
    ]
     with Instantiable2[
      /* textureLoader */ js.Function1[/* image */ HTMLImageElement, js.Any], 
      /* pathPrefix */ String, 
      AssetManager
    ] {
  var downloadBinary: js.Any = js.native
  var downloadText: js.Any = js.native
}

