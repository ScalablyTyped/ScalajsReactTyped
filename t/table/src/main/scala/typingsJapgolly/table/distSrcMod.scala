package typingsJapgolly.table

import typingsJapgolly.table.distSrcTypesApiMod.BorderConfig
import typingsJapgolly.table.distSrcTypesApiMod.StreamUserConfig
import typingsJapgolly.table.distSrcTypesApiMod.TableUserConfig
import typingsJapgolly.table.distSrcTypesApiMod.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMod {
  
  @JSImport("table/dist/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStream(userConfig: StreamUserConfig): WritableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createStream")(userConfig.asInstanceOf[js.Any]).asInstanceOf[WritableStream]
  
  inline def getBorderCharacters(name: String): BorderConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("getBorderCharacters")(name.asInstanceOf[js.Any]).asInstanceOf[BorderConfig]
  
  inline def table(data: js.Array[js.Array[Any]]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("table")(data.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def table(data: js.Array[js.Array[Any]], userConfig: TableUserConfig): String = (^.asInstanceOf[js.Dynamic].applyDynamic("table")(data.asInstanceOf[js.Any], userConfig.asInstanceOf[js.Any])).asInstanceOf[String]
}
