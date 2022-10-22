package typingsJapgolly.mongodb.mod

import typingsJapgolly.mongodb.mongodbInts.`0`
import typingsJapgolly.mongodb.mongodbInts.`1`
import typingsJapgolly.mongodb.mongodbInts.`2`
import typingsJapgolly.mongodb.mongodbInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mongodb.mongodbInts.`0`
  - typingsJapgolly.mongodb.mongodbInts.`1`
  - typingsJapgolly.mongodb.mongodbInts.`2`
  - typingsJapgolly.mongodb.mongodbInts.`3`
*/
trait Compressor extends StObject
/* Inlined std.Readonly<{ readonly none :0,  readonly snappy :1,  readonly zlib :2,  readonly zstd :3}> */
object Compressor {
  
  @JSImport("mongodb", "Compressor.none")
  @js.native
  val none: `0` = js.native
  
  @JSImport("mongodb", "Compressor.snappy")
  @js.native
  val snappy: `1` = js.native
  
  @JSImport("mongodb", "Compressor.zlib")
  @js.native
  val zlib: `2` = js.native
  
  @JSImport("mongodb", "Compressor.zstd")
  @js.native
  val zstd: `3` = js.native
}
