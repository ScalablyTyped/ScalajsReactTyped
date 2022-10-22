package typingsJapgolly.parquetjs

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.nodeInt64.mod.^
import typingsJapgolly.parquetjs.libMetadataDotinterfaceMod.MetadataInterface
import typingsJapgolly.parquetjs.libMetadataDotinterfaceMod.MetadataRowGroupsInterface
import typingsJapgolly.parquetjs.libRowBufferDotinterfaceMod.RowBufferInterface
import typingsJapgolly.parquetjs.libRowDotinterfaceMod.RowInterface
import typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReaderMod {
  
  @JSImport("parquetjs/lib/reader", "ParquetCursor")
  @js.native
  open class ParquetCursor protected () extends StObject {
    def this(
      metadata: MetadataInterface,
      envelopeReader: ParquetEnvelopeReader,
      schema: ParquetSchema,
      columnList: js.Array[js.Array[String] | String]
    ) = this()
    
    var columnList: js.Array[js.Array[String] | String] = js.native
    
    var envelopeReader: ParquetEnvelopeReader = js.native
    
    var metadata: MetadataInterface = js.native
    
    def next(): js.Promise[RowInterface] = js.native
    
    def rewind(): Unit = js.native
    
    var rowGroup: js.Array[RowInterface] = js.native
    
    var rowGroupIndex: Double = js.native
    
    var schema: ParquetSchema = js.native
  }
  
  @JSImport("parquetjs/lib/reader", "ParquetEnvelopeReader")
  @js.native
  open class ParquetEnvelopeReader protected () extends StObject {
    def this(
      readFn: js.Function3[
            /* fd */ Double, 
            /* position */ Double, 
            /* length */ Double, 
            js.Promise[Buffer | js.Error]
          ],
      closeFn: js.Function1[/* fd */ Double, js.Promise[js.Error]],
      fileSize: Double
    ) = this()
    
    def close(fd: Double): js.Promise[js.Error] = js.native
    
    var fileSize: Double = js.native
    
    def read(fd: Double, position: Double, length: Double): js.Promise[Buffer | js.Error] = js.native
    
    def readColumnChunk(schema: ParquetSchema, colChunk: js.Object): Unit = js.native
    
    def readFooter(): MetadataInterface = js.native
    
    def readHeader(): scala.Nothing = js.native
    
    def readRowGroup(
      schema: ParquetSchema,
      rowGroup: MetadataRowGroupsInterface,
      columnList: js.Array[js.Array[String] | String]
    ): RowBufferInterface = js.native
  }
  /* static members */
  object ParquetEnvelopeReader {
    
    @JSImport("parquetjs/lib/reader", "ParquetEnvelopeReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def openFile(filePath: String): ParquetReader = ^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[ParquetReader]
  }
  
  @JSImport("parquetjs/lib/reader", "ParquetReader")
  @js.native
  open class ParquetReader protected () extends StObject {
    def this(metadata: MetadataInterface, envelopeReader: ParquetEnvelopeReader) = this()
    
    def close(): js.Promise[Unit] = js.native
    
    var envelopeReader: ParquetEnvelopeReader = js.native
    
    def getCursor(): ParquetCursor = js.native
    def getCursor(columnList: js.Array[js.Array[String] | String]): ParquetCursor = js.native
    
    def getMetadata(): StringDictionary[String] = js.native
    
    def getRowCount(): ^ = js.native
    
    def getSchema(): ParquetSchema = js.native
    
    var metadata: MetadataInterface = js.native
    
    var schema: ParquetSchema = js.native
  }
  /* static members */
  object ParquetReader {
    
    @JSImport("parquetjs/lib/reader", "ParquetReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def openFile(filePath: String): js.Promise[ParquetReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ParquetReader]]
  }
}
