package typingsJapgolly.parquetjs

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.WriteStream
import typingsJapgolly.parquetjs.libMetadataDotinterfaceMod.MetadataInterface
import typingsJapgolly.parquetjs.libRowBufferDotinterfaceMod.RowBufferInterface
import typingsJapgolly.parquetjs.libRowDotinterfaceMod.RowInterface
import typingsJapgolly.parquetjs.libSchemaDotinterfaceMod.SchemaInterface
import typingsJapgolly.parquetjs.libWriterMod.ParquetWriterOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parquetMod {
  
  @JSImport("parquetjs/parquet", "ParquetEnvelopeReader")
  @js.native
  open class ParquetEnvelopeReader protected ()
    extends typingsJapgolly.parquetjs.libReaderMod.ParquetEnvelopeReader {
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
  /* static members */
  object ParquetEnvelopeReader {
    
    @JSImport("parquetjs/parquet", "ParquetEnvelopeReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def openFile(filePath: String): typingsJapgolly.parquetjs.libReaderMod.ParquetReader = ^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.parquetjs.libReaderMod.ParquetReader]
  }
  
  @JSImport("parquetjs/parquet", "ParquetEnvelopeWriter")
  @js.native
  open class ParquetEnvelopeWriter protected ()
    extends typingsJapgolly.parquetjs.libWriterMod.ParquetEnvelopeWriter {
    def this(
      schema: typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema,
      writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
      closeFn: js.Function0[js.Promise[Unit]],
      fileOffset: Double
    ) = this()
    def this(
      schema: typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema,
      writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
      closeFn: js.Function0[js.Promise[Unit]],
      fileOffset: Double,
      opts: String
    ) = this()
    def this(
      schema: typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema,
      writeFn: js.Function1[/* buf */ Buffer, js.Promise[Unit]],
      closeFn: js.Function0[js.Promise[Unit]],
      fileOffset: Double,
      opts: ParquetWriterOpts
    ) = this()
  }
  /* static members */
  object ParquetEnvelopeWriter {
    
    @JSImport("parquetjs/parquet", "ParquetEnvelopeWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def openStream(schema: typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema, outputStream: WriteStream): js.Promise[typingsJapgolly.parquetjs.libWriterMod.ParquetEnvelopeWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.parquetjs.libWriterMod.ParquetEnvelopeWriter]]
    inline def openStream(
      schema: typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema,
      outputStream: WriteStream,
      opts: String
    ): js.Promise[typingsJapgolly.parquetjs.libWriterMod.ParquetEnvelopeWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.parquetjs.libWriterMod.ParquetEnvelopeWriter]]
    inline def openStream(
      schema: typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema,
      outputStream: WriteStream,
      opts: ParquetWriterOpts
    ): js.Promise[typingsJapgolly.parquetjs.libWriterMod.ParquetEnvelopeWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.parquetjs.libWriterMod.ParquetEnvelopeWriter]]
  }
  
  @JSImport("parquetjs/parquet", "ParquetReader")
  @js.native
  open class ParquetReader protected ()
    extends typingsJapgolly.parquetjs.libReaderMod.ParquetReader {
    def this(
      metadata: MetadataInterface,
      envelopeReader: typingsJapgolly.parquetjs.libReaderMod.ParquetEnvelopeReader
    ) = this()
  }
  /* static members */
  object ParquetReader {
    
    @JSImport("parquetjs/parquet", "ParquetReader")
    @js.native
    val ^ : js.Any = js.native
    
    inline def openFile(filePath: String): js.Promise[typingsJapgolly.parquetjs.libReaderMod.ParquetReader] = ^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.parquetjs.libReaderMod.ParquetReader]]
  }
  
  @JSImport("parquetjs/parquet", "ParquetSchema")
  @js.native
  open class ParquetSchema protected ()
    extends typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema {
    def this(schema: SchemaInterface) = this()
  }
  
  object ParquetShredder {
    
    @JSImport("parquetjs/parquet", "ParquetShredder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def materializeRecords(schema: typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema, buffer: RowBufferInterface): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("materializeRecords")(schema.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def shredRecord(
      schema: typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema,
      record: RowInterface,
      buffer: RowBufferInterface
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("shredRecord")(schema.asInstanceOf[js.Any], record.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("parquetjs/parquet", "ParquetTransformer")
  @js.native
  open class ParquetTransformer protected ()
    extends typingsJapgolly.parquetjs.libWriterMod.ParquetTransformer {
    def this(schema: typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema) = this()
    def this(schema: typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema, opts: String) = this()
    def this(schema: typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema, opts: ParquetWriterOpts) = this()
  }
  
  @JSImport("parquetjs/parquet", "ParquetWriter")
  @js.native
  open class ParquetWriter protected ()
    extends typingsJapgolly.parquetjs.libWriterMod.ParquetWriter {
    def this(
      schema: typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema,
      envelopeWriter: typingsJapgolly.parquetjs.libWriterMod.ParquetEnvelopeWriter
    ) = this()
    def this(
      schema: typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema,
      envelopeWriter: typingsJapgolly.parquetjs.libWriterMod.ParquetEnvelopeWriter,
      opts: String
    ) = this()
    def this(
      schema: typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema,
      envelopeWriter: typingsJapgolly.parquetjs.libWriterMod.ParquetEnvelopeWriter,
      opts: ParquetWriterOpts
    ) = this()
  }
  /* static members */
  object ParquetWriter {
    
    @JSImport("parquetjs/parquet", "ParquetWriter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def openFile(schema: typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema, path: PathLike): js.Promise[typingsJapgolly.parquetjs.libWriterMod.ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.parquetjs.libWriterMod.ParquetWriter]]
    inline def openFile(schema: typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema, path: PathLike, opts: String): js.Promise[typingsJapgolly.parquetjs.libWriterMod.ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.parquetjs.libWriterMod.ParquetWriter]]
    inline def openFile(
      schema: typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema,
      path: PathLike,
      opts: ParquetWriterOpts
    ): js.Promise[typingsJapgolly.parquetjs.libWriterMod.ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openFile")(schema.asInstanceOf[js.Any], path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.parquetjs.libWriterMod.ParquetWriter]]
    
    inline def openStream(schema: typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema, outputStream: WriteStream): js.Promise[typingsJapgolly.parquetjs.libWriterMod.ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.parquetjs.libWriterMod.ParquetWriter]]
    inline def openStream(
      schema: typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema,
      outputStream: WriteStream,
      opts: String
    ): js.Promise[typingsJapgolly.parquetjs.libWriterMod.ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.parquetjs.libWriterMod.ParquetWriter]]
    inline def openStream(
      schema: typingsJapgolly.parquetjs.libSchemaMod.ParquetSchema,
      outputStream: WriteStream,
      opts: ParquetWriterOpts
    ): js.Promise[typingsJapgolly.parquetjs.libWriterMod.ParquetWriter] = (^.asInstanceOf[js.Dynamic].applyDynamic("openStream")(schema.asInstanceOf[js.Any], outputStream.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.parquetjs.libWriterMod.ParquetWriter]]
  }
}
