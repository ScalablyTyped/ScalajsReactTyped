package typingsJapgolly.sipJs.mod.Core

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sip.js", "Core.NameAddrHeader")
@js.native
open class NameAddrHeader protected ()
  extends typingsJapgolly.sipJs.libCoreMod.NameAddrHeader {
  /**
    * Constructor
    * @param uri -
    * @param displayName -
    * @param parameters -
    */
  def this(
    uri: typingsJapgolly.sipJs.libGrammarUriMod.URI,
    displayName: String,
    parameters: StringDictionary[String]
  ) = this()
}
