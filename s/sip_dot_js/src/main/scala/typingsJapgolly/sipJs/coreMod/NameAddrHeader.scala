package typingsJapgolly.sipJs.coreMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core", "NameAddrHeader")
@js.native
class NameAddrHeader protected ()
  extends typingsJapgolly.sipJs.messagesMod.NameAddrHeader {
  /**
    * Constructor
    * @param uri -
    * @param displayName -
    * @param parameters -
    */
  def this(uri: typingsJapgolly.sipJs.uriMod.URI, displayName: String, parameters: StringDictionary[String]) = this()
}

