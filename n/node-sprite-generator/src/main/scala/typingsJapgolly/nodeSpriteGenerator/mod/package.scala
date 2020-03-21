package typingsJapgolly.nodeSpriteGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type LayoutFunc = js.Function3[
    /* images */ js.Array[typingsJapgolly.nodeSpriteGenerator.mod.Image], 
    /* options */ typingsJapgolly.nodeSpriteGenerator.mod.LayoutOption, 
    /* callback */ js.Function2[
      /* error */ js.Error, 
      /* layout */ typingsJapgolly.nodeSpriteGenerator.mod.Layout, 
      scala.Unit
    ], 
    scala.Unit
  ]
  type StylesheetFunc = js.Function5[
    /* layout */ typingsJapgolly.nodeSpriteGenerator.mod.Layout, 
    /* stylesheetPath */ java.lang.String, 
    /* spritePath */ java.lang.String, 
    /* options */ typingsJapgolly.nodeSpriteGenerator.mod.StylesheetOption, 
    /* callback */ js.Function1[/* error */ js.Error, scala.Unit], 
    scala.Unit
  ]
}
