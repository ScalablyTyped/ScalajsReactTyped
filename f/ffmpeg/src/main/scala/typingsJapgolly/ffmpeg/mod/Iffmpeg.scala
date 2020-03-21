package typingsJapgolly.ffmpeg.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iffmpeg
  extends Instantiable1[/* filePath */ String, js.Promise[Video]]
     with Instantiable2[
      /* filePath */ String, 
      /* cb */ js.Function2[/* err */ Error, /* video */ Video, Unit], 
      js.Promise[Video]
    ]

