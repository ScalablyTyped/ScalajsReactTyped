package typingsJapgolly.appBuilderLib

import typingsJapgolly.builderUtilRuntime.outPublishOptionsMod.BaseS3Options
import typingsJapgolly.electronPublish.mod.PublishContext
import typingsJapgolly.electronPublish.mod.Publisher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outPublishS3BaseS3PublisherMod {
  
  /* note: abstract class */ @JSImport("app-builder-lib/out/publish/s3/BaseS3Publisher", "BaseS3Publisher")
  @js.native
  open class BaseS3Publisher protected () extends Publisher {
    /* protected */ def this(context: PublishContext, options: BaseS3Options) = this()
    
    /* protected */ def configureS3Options(args: js.Array[String]): Unit = js.native
    
    /* protected */ def getBucketName(): String = js.native
    
    /* private */ var options: Any = js.native
  }
}
