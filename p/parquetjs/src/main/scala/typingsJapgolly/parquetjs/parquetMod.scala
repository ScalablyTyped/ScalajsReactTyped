package typingsJapgolly.parquetjs

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.WriteStream
import typingsJapgolly.parquetjs.metadataInterfaceMod.MetadataInterface
import typingsJapgolly.parquetjs.rowBufferInterfaceMod.RowBufferInterface
import typingsJapgolly.parquetjs.rowInterfaceMod.RowInterface
import typingsJapgolly.parquetjs.schemaInterfaceMod.SchemaInterface
import typingsJapgolly.parquetjs.writerMod.ParquetWriterOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parquetjs/parquet", JSImport.Namespace)
@js.native
object parquetMod extends js.Object {
  @js.native
  class ParquetEnvelopeReader protected ()
    extends typingsJapgolly.parquetjs.readerMod.ParquetEnvelopeReader {
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
  }
  
  @js.native
  class ParquetEnvelopeWriter protected ()
    extends typingsJapgolly.parquetjs.writerMod.ParquetEnvelopeWriter {
    def this(
      schema: typingsJapgolly.parquetjs.schemaMod.ParquetSchema,
      writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
      closeFn: js.Function0[js.Promise[Unit]],
      fileOffset: Double
    ) = this()
    def this(
      schema: typingsJapgolly.parquetjs.schemaMod.ParquetSchema,
      writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
      closeFn: js.Function0[js.Promise[Unit]],
      fileOffset: Double,
      opts: String
    ) = this()
    def this(
      schema: typingsJapgolly.parquetjs.schemaMod.ParquetSchema,
      writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
      closeFn: js.Function0[js.Promise[Unit]],
      fileOffset: Double,
      opts: ParquetWriterOpts
    ) = this()
  }
  
  @js.native
  class ParquetReader protected ()
    extends typingsJapgolly.parquetjs.readerMod.ParquetReader {
    def this(
      metadata: MetadataInterface,
      envelopeReader: typingsJapgolly.parquetjs.readerMod.ParquetEnvelopeReader
    ) = this()
  }
  
  @js.native
  class ParquetSchema protected ()
    extends typingsJapgolly.parquetjs.schemaMod.ParquetSchema {
    def this(schema: SchemaInterface) = this()
  }
  
  @js.native
  class ParquetTransformer protected ()
    extends typingsJapgolly.parquetjs.writerMod.ParquetTransformer {
    def this(schema: typingsJapgolly.parquetjs.schemaMod.ParquetSchema) = this()
    def this(schema: typingsJapgolly.parquetjs.schemaMod.ParquetSchema, opts: String) = this()
    def this(schema: typingsJapgolly.parquetjs.schemaMod.ParquetSchema, opts: ParquetWriterOpts) = this()
  }
  
  @js.native
  class ParquetWriter protected ()
    extends typingsJapgolly.parquetjs.writerMod.ParquetWriter {
    def this(
      schema: typingsJapgolly.parquetjs.schemaMod.ParquetSchema,
      envelopeWriter: typingsJapgolly.parquetjs.writerMod.ParquetEnvelopeWriter
    ) = this()
    def this(
      schema: typingsJapgolly.parquetjs.schemaMod.ParquetSchema,
      envelopeWriter: typingsJapgolly.parquetjs.writerMod.ParquetEnvelopeWriter,
      opts: String
    ) = this()
    def this(
      schema: typingsJapgolly.parquetjs.schemaMod.ParquetSchema,
      envelopeWriter: typingsJapgolly.parquetjs.writerMod.ParquetEnvelopeWriter,
      opts: ParquetWriterOpts
    ) = this()
  }
  
  /* static members */
  @js.native
  object ParquetEnvelopeReader extends js.Object {
    def openFile(filePath: String): typingsJapgolly.parquetjs.readerMod.ParquetReader = js.native
  }
  
  /* static members */
  @js.native
  object ParquetEnvelopeWriter extends js.Object {
    def openStream(schema: typingsJapgolly.parquetjs.schemaMod.ParquetSchema, outputStream: WriteStream): js.Promise[typingsJapgolly.parquetjs.writerMod.ParquetEnvelopeWriter] = js.native
    def openStream(schema: typingsJapgolly.parquetjs.schemaMod.ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[typingsJapgolly.parquetjs.writerMod.ParquetEnvelopeWriter] = js.native
    def openStream(
      schema: typingsJapgolly.parquetjs.schemaMod.ParquetSchema,
      outputStream: WriteStream,
      opts: ParquetWriterOpts
    ): js.Promise[typingsJapgolly.parquetjs.writerMod.ParquetEnvelopeWriter] = js.native
  }
  
  /* static members */
  @js.native
  object ParquetReader extends js.Object {
    def openFile(filePath: String): js.Promise[typingsJapgolly.parquetjs.readerMod.ParquetReader] = js.native
  }
  
  @js.native
  object ParquetShredder extends js.Object {
    def materializeRecords(schema: typingsJapgolly.parquetjs.schemaMod.ParquetSchema, buffer: RowBufferInterface): Unit = js.native
    def shredRecord(
      schema: typingsJapgolly.parquetjs.schemaMod.ParquetSchema,
      record: RowInterface,
      buffer: RowBufferInterface
    ): Unit = js.native
  }
  
  /* static members */
  @js.native
  object ParquetWriter extends js.Object {
    def openFile(schema: typingsJapgolly.parquetjs.schemaMod.ParquetSchema, path: PathLike): js.Promise[typingsJapgolly.parquetjs.writerMod.ParquetWriter] = js.native
    def openFile(schema: typingsJapgolly.parquetjs.schemaMod.ParquetSchema, path: PathLike, opts: String): js.Promise[typingsJapgolly.parquetjs.writerMod.ParquetWriter] = js.native
    def openFile(schema: typingsJapgolly.parquetjs.schemaMod.ParquetSchema, path: PathLike, opts: ParquetWriterOpts): js.Promise[typingsJapgolly.parquetjs.writerMod.ParquetWriter] = js.native
    def openStream(schema: typingsJapgolly.parquetjs.schemaMod.ParquetSchema, outputStream: WriteStream): js.Promise[typingsJapgolly.parquetjs.writerMod.ParquetWriter] = js.native
    def openStream(schema: typingsJapgolly.parquetjs.schemaMod.ParquetSchema, outputStream: WriteStream, opts: String): js.Promise[typingsJapgolly.parquetjs.writerMod.ParquetWriter] = js.native
    def openStream(
      schema: typingsJapgolly.parquetjs.schemaMod.ParquetSchema,
      outputStream: WriteStream,
      opts: ParquetWriterOpts
    ): js.Promise[typingsJapgolly.parquetjs.writerMod.ParquetWriter] = js.native
  }
  
}

