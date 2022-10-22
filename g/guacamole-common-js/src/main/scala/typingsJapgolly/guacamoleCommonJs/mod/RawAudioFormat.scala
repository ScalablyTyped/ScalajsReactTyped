package typingsJapgolly.guacamoleCommonJs.mod

import typingsJapgolly.guacamoleCommonJs.libGuacCommonMod.Mimetype
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("guacamole-common-js", "RawAudioFormat")
@js.native
open class RawAudioFormat protected ()
  extends typingsJapgolly.guacamoleCommonJs.libRawAudioFormatMod.RawAudioFormat {
  /**
    * @param template The object whose properties should be copied into the corresponding
    * properties of the new Guacamole.RawAudioFormat.
    */
  def this(template: typingsJapgolly.guacamoleCommonJs.libRawAudioFormatMod.RawAudioFormat) = this()
}
/* static members */
object RawAudioFormat {
  
  @JSImport("guacamole-common-js", "RawAudioFormat")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses the given mimetype, returning a new Guacamole.RawAudioFormat
    * which describes the type of raw audio data represented by that mimetype. If
    * the mimetype is not a supported raw audio data mimetype, null is returned.
    *
    * @param mimetype The audio mimetype to parse.
    * @returns
    *     A new Guacamole.RawAudioFormat which describes the type of raw
    *     audio data represented by the given mimetype, or null if the given
    *     mimetype is not supported.
    */
  inline def parse(mimetype: Mimetype): typingsJapgolly.guacamoleCommonJs.libRawAudioFormatMod.RawAudioFormat = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(mimetype.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.guacamoleCommonJs.libRawAudioFormatMod.RawAudioFormat]
}
