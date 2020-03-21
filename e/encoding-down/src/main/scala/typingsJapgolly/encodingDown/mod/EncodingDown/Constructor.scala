package typingsJapgolly.encodingDown.mod.EncodingDown

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.abstractLeveldown.mod.AbstractLevelDOWN
import typingsJapgolly.levelCodec.mod.CodecOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends // tslint:disable-next-line:no-unnecessary-generics
Instantiable1[
      /* db */ AbstractLevelDOWN[js.Any, js.Any], 
      typingsJapgolly.encodingDown.mod.EncodingDown[js.Object, js.Object]
    ]
     with Instantiable2[
      /* db */ AbstractLevelDOWN[js.Any, js.Any], 
      /* options */ CodecOptions, 
      typingsJapgolly.encodingDown.mod.EncodingDown[js.Object, js.Object]
    ] {
  // tslint:disable-next-line:no-unnecessary-generics
  def apply[K, V](db: AbstractLevelDOWN[_, _]): typingsJapgolly.encodingDown.mod.EncodingDown[K, V] = js.native
  def apply[K, V](db: AbstractLevelDOWN[_, _], options: CodecOptions): typingsJapgolly.encodingDown.mod.EncodingDown[K, V] = js.native
}

