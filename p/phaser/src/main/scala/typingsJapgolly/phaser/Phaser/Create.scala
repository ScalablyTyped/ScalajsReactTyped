package typingsJapgolly.phaser.Phaser

import org.scalajs.dom.raw.HTMLCanvasElement
import typingsJapgolly.phaser.Phaser.Types.Create.GenerateTextureConfig
import typingsJapgolly.phaser.Phaser.Types.Create.Palette
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Create")
@js.native
object Create extends js.Object {
  /**
    * [description]
    * @param config [description]
    */
  def GenerateTexture(config: GenerateTextureConfig): HTMLCanvasElement = js.native
  @js.native
  object Palettes extends js.Object {
    /**
      * A 16 color palette by [Arne](http://androidarts.com/palette/16pal.htm)
      */
    var ARNE16: Palette = js.native
    /**
      * A 16 color palette inspired by the Commodore 64.
      */
    var C64: Palette = js.native
    /**
      * A 16 color CGA inspired palette by [Arne](http://androidarts.com/palette/16pal.htm)
      */
    var CGA: Palette = js.native
    /**
      * A 16 color JMP palette by [Arne](http://androidarts.com/palette/16pal.htm)
      */
    var JMP: Palette = js.native
    /**
      * A 16 color palette inspired by Japanese computers like the MSX.
      */
    var MSX: Palette = js.native
  }
  
}

