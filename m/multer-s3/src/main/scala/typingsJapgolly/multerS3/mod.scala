package typingsJapgolly.multerS3

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.expressServeStaticCore.Express.Request
import typingsJapgolly.multer.mod.StorageEngine
import typingsJapgolly.multer.mod.global.Express.Multer.File
import typingsJapgolly.node.NodeJS.ReadableStream
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("multer-s3", JSImport.Namespace)
  @js.native
  val ^ : S3Storage = js.native
  
  trait Options extends StObject {
    
    var acl: js.UndefOr[
        (js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ Any, /* acl */ js.UndefOr[String], Unit], 
          Unit
        ]) | String
      ] = js.undefined
    
    var bucket: (js.Function3[
        /* req */ Request, 
        /* file */ File, 
        /* callback */ js.Function2[/* error */ Any, /* bucket */ js.UndefOr[String], Unit], 
        Unit
      ]) | String
    
    var cacheControl: js.UndefOr[
        (js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ Any, /* cacheControl */ js.UndefOr[String], Unit], 
          Unit
        ]) | String
      ] = js.undefined
    
    var contentDisposition: js.UndefOr[
        (js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ Any, /* contentDisposition */ js.UndefOr[String], Unit], 
          Unit
        ]) | String
      ] = js.undefined
    
    var contentType: js.UndefOr[
        js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function3[
            /* error */ Any, 
            /* mime */ js.UndefOr[String], 
            /* stream */ js.UndefOr[ReadableStream], 
            Unit
          ], 
          Unit
        ]
      ] = js.undefined
    
    var key: js.UndefOr[
        js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ Any, /* key */ js.UndefOr[String], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var metadata: js.UndefOr[
        js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ Any, /* metadata */ js.UndefOr[Any], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var s3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify S3Client */ Any
    
    var serverSideEncryption: js.UndefOr[
        (js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ Any, /* serverSideEncryption */ js.UndefOr[String], Unit], 
          Unit
        ]) | String
      ] = js.undefined
  }
  object Options {
    
    inline def apply(
      bucket: (js.Function3[
          /* req */ Request, 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ Any, /* bucket */ js.UndefOr[String], Unit], 
          Unit
        ]) | String,
      s3: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify S3Client */ Any
    ): Options = {
      val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], s3 = s3.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAcl(
        value: (js.Function3[
              /* req */ Request, 
              /* file */ File, 
              /* callback */ js.Function2[/* error */ Any, /* acl */ js.UndefOr[String], Unit], 
              Unit
            ]) | String
      ): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
      
      inline def setAclFunction3(
        value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ Any, /* acl */ js.UndefOr[String], Unit]) => Callback
      ): Self = StObject.set(x, "acl", js.Any.fromFunction3((t0: /* req */ Request, t1: /* file */ File, t2: /* callback */ js.Function2[/* error */ Any, /* acl */ js.UndefOr[String], Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setAclUndefined: Self = StObject.set(x, "acl", js.undefined)
      
      inline def setBucket(
        value: (js.Function3[
              /* req */ Request, 
              /* file */ File, 
              /* callback */ js.Function2[/* error */ Any, /* bucket */ js.UndefOr[String], Unit], 
              Unit
            ]) | String
      ): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
      
      inline def setBucketFunction3(
        value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ Any, /* bucket */ js.UndefOr[String], Unit]) => Callback
      ): Self = StObject.set(x, "bucket", js.Any.fromFunction3((t0: /* req */ Request, t1: /* file */ File, t2: /* callback */ js.Function2[/* error */ Any, /* bucket */ js.UndefOr[String], Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setCacheControl(
        value: (js.Function3[
              /* req */ Request, 
              /* file */ File, 
              /* callback */ js.Function2[/* error */ Any, /* cacheControl */ js.UndefOr[String], Unit], 
              Unit
            ]) | String
      ): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
      
      inline def setCacheControlFunction3(
        value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ Any, /* cacheControl */ js.UndefOr[String], Unit]) => Callback
      ): Self = StObject.set(x, "cacheControl", js.Any.fromFunction3((t0: /* req */ Request, t1: /* file */ File, t2: /* callback */ js.Function2[/* error */ Any, /* cacheControl */ js.UndefOr[String], Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
      
      inline def setContentDisposition(
        value: (js.Function3[
              /* req */ Request, 
              /* file */ File, 
              /* callback */ js.Function2[/* error */ Any, /* contentDisposition */ js.UndefOr[String], Unit], 
              Unit
            ]) | String
      ): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
      
      inline def setContentDispositionFunction3(
        value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ Any, /* contentDisposition */ js.UndefOr[String], Unit]) => Callback
      ): Self = StObject.set(x, "contentDisposition", js.Any.fromFunction3((t0: /* req */ Request, t1: /* file */ File, t2: /* callback */ js.Function2[/* error */ Any, /* contentDisposition */ js.UndefOr[String], Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setContentDispositionUndefined: Self = StObject.set(x, "contentDisposition", js.undefined)
      
      inline def setContentType(
        value: (/* req */ Request, /* file */ File, /* callback */ js.Function3[
              /* error */ Any, 
              /* mime */ js.UndefOr[String], 
              /* stream */ js.UndefOr[ReadableStream], 
              Unit
            ]) => Callback
      ): Self = StObject.set(x, "contentType", js.Any.fromFunction3((t0: /* req */ Request, t1: /* file */ File, t2: /* callback */ js.Function3[
              /* error */ Any, 
              /* mime */ js.UndefOr[String], 
              /* stream */ js.UndefOr[ReadableStream], 
              Unit
            ]) => (value(t0, t1, t2)).runNow()))
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setKey(
        value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ Any, /* key */ js.UndefOr[String], Unit]) => Callback
      ): Self = StObject.set(x, "key", js.Any.fromFunction3((t0: /* req */ Request, t1: /* file */ File, t2: /* callback */ js.Function2[/* error */ Any, /* key */ js.UndefOr[String], Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMetadata(
        value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ Any, /* metadata */ js.UndefOr[Any], Unit]) => Callback
      ): Self = StObject.set(x, "metadata", js.Any.fromFunction3((t0: /* req */ Request, t1: /* file */ File, t2: /* callback */ js.Function2[/* error */ Any, /* metadata */ js.UndefOr[Any], Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setS3(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify S3Client */ Any
      ): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
      
      inline def setServerSideEncryption(
        value: (js.Function3[
              /* req */ Request, 
              /* file */ File, 
              /* callback */ js.Function2[/* error */ Any, /* serverSideEncryption */ js.UndefOr[String], Unit], 
              Unit
            ]) | String
      ): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
      
      inline def setServerSideEncryptionFunction3(
        value: (/* req */ Request, /* file */ File, /* callback */ js.Function2[/* error */ Any, /* serverSideEncryption */ js.UndefOr[String], Unit]) => Callback
      ): Self = StObject.set(x, "serverSideEncryption", js.Any.fromFunction3((t0: /* req */ Request, t1: /* file */ File, t2: /* callback */ js.Function2[/* error */ Any, /* serverSideEncryption */ js.UndefOr[String], Unit]) => (value(t0, t1, t2)).runNow()))
      
      inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "serverSideEncryption", js.undefined)
    }
  }
  
  @js.native
  trait S3Storage extends StObject {
    
    def apply(): StorageEngine = js.native
    def apply(options: Options): StorageEngine = js.native
    
    def AUTO_CONTENT_TYPE(
      req: Request,
      file: File,
      callback: js.Function3[
          /* error */ Any, 
          /* mime */ js.UndefOr[String], 
          /* stream */ js.UndefOr[ReadableStream], 
          Unit
        ]
    ): Unit = js.native
    
    def DEFAULT_CONTENT_TYPE(
      req: Request,
      file: File,
      callback: js.Function2[/* error */ Any, /* mime */ js.UndefOr[String], Unit]
    ): Unit = js.native
  }
  
  type _To = S3Storage
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: S3Storage = ^
  
  object global {
    
    object Express {
      
      object MulterS3 {
        
        trait File
          extends StObject
             with typingsJapgolly.multer.mod.global.Express.Multer.File {
          
          var acl: String
          
          var bucket: String
          
          var contentDisposition: Null
          
          var contentType: String
          
          var etag: String
          
          var key: String
          
          var location: String
          
          var metadata: Any
          
          var serverSideEncryption: Null
          
          var storageClass: String
        }
        object File {
          
          inline def apply(
            acl: String,
            bucket: String,
            buffer: Buffer,
            contentDisposition: Null,
            contentType: String,
            destination: String,
            encoding: String,
            etag: String,
            fieldname: String,
            filename: String,
            key: String,
            location: String,
            metadata: Any,
            mimetype: String,
            originalname: String,
            path: String,
            serverSideEncryption: Null,
            size: Double,
            storageClass: String,
            stream: Readable
          ): typingsJapgolly.multerS3.mod.global.Express.MulterS3.File = {
            val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], contentDisposition = contentDisposition.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], fieldname = fieldname.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], originalname = originalname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serverSideEncryption = serverSideEncryption.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], storageClass = storageClass.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
            __obj.asInstanceOf[typingsJapgolly.multerS3.mod.global.Express.MulterS3.File]
          }
          
          extension [Self <: typingsJapgolly.multerS3.mod.global.Express.MulterS3.File](x: Self) {
            
            inline def setAcl(value: String): Self = StObject.set(x, "acl", value.asInstanceOf[js.Any])
            
            inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
            
            inline def setContentDisposition(value: Null): Self = StObject.set(x, "contentDisposition", value.asInstanceOf[js.Any])
            
            inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
            
            inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
            
            inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
            
            inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
            
            inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
            
            inline def setServerSideEncryption(value: Null): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
            
            inline def setStorageClass(value: String): Self = StObject.set(x, "storageClass", value.asInstanceOf[js.Any])
          }
        }
      }
    }
  }
}
