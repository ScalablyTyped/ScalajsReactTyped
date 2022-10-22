package typingsJapgolly.kdbxweb.mod

import typingsJapgolly.kdbxweb.anon.PreserveXml
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("kdbxweb", "Kdbx")
@js.native
open class Kdbx ()
  extends typingsJapgolly.kdbxweb.distTypesFormatKdbxMod.Kdbx
/* static members */
object Kdbx {
  
  @JSImport("kdbxweb", "Kdbx")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new database
    */
  inline def create(
    credentials: typingsJapgolly.kdbxweb.distTypesFormatKdbxCredentialsMod.KdbxCredentials,
    name: String
  ): typingsJapgolly.kdbxweb.distTypesFormatKdbxMod.Kdbx = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(credentials.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.kdbxweb.distTypesFormatKdbxMod.Kdbx]
  
  /**
    * Load a kdbx file
    * If there was an error loading file, throws an exception
    */
  inline def load(
    data: js.typedarray.ArrayBuffer,
    credentials: typingsJapgolly.kdbxweb.distTypesFormatKdbxCredentialsMod.KdbxCredentials
  ): js.Promise[typingsJapgolly.kdbxweb.distTypesFormatKdbxMod.Kdbx] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.kdbxweb.distTypesFormatKdbxMod.Kdbx]]
  inline def load(
    data: js.typedarray.ArrayBuffer,
    credentials: typingsJapgolly.kdbxweb.distTypesFormatKdbxCredentialsMod.KdbxCredentials,
    options: PreserveXml
  ): js.Promise[typingsJapgolly.kdbxweb.distTypesFormatKdbxMod.Kdbx] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(data.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.kdbxweb.distTypesFormatKdbxMod.Kdbx]]
  
  /**
    * Import database from an xml file
    * If there was an error loading file, throws an exception
    */
  inline def loadXml(
    data: String,
    credentials: typingsJapgolly.kdbxweb.distTypesFormatKdbxCredentialsMod.KdbxCredentials
  ): js.Promise[typingsJapgolly.kdbxweb.distTypesFormatKdbxMod.Kdbx] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadXml")(data.asInstanceOf[js.Any], credentials.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.kdbxweb.distTypesFormatKdbxMod.Kdbx]]
}
