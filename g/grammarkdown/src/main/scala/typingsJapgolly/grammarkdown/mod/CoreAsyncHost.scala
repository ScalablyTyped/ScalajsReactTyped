package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.distHostMod.CoreAsyncHostOptions
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "CoreAsyncHost")
@js.native
open class CoreAsyncHost protected ()
  extends typingsJapgolly.grammarkdown.distHostMod.CoreAsyncHost {
  /**
    * @param options The options used to configure the host.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  def this(options: CoreAsyncHostOptions) = this()
  def this(
    options: CoreAsyncHostOptions,
    hostFallback: typingsJapgolly.grammarkdown.distHostMod.CoreAsyncHost
  ) = this()
}
/* static members */
object CoreAsyncHost {
  
  @JSImport("grammarkdown", "CoreAsyncHost")
  @js.native
  val ^ : js.Any = js.native
  
  inline def forFile(content: String): typingsJapgolly.grammarkdown.distHostMod.StringAsyncHost = ^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.grammarkdown.distHostMod.StringAsyncHost]
  inline def forFile(content: String, file: String): typingsJapgolly.grammarkdown.distHostMod.StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.grammarkdown.distHostMod.StringAsyncHost]
  inline def forFile(
    content: String,
    file: String,
    hostFallback: typingsJapgolly.grammarkdown.distHostMod.CoreAsyncHost
  ): typingsJapgolly.grammarkdown.distHostMod.StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.grammarkdown.distHostMod.StringAsyncHost]
  inline def forFile(content: String, file: Unit, hostFallback: typingsJapgolly.grammarkdown.distHostMod.CoreAsyncHost): typingsJapgolly.grammarkdown.distHostMod.StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.grammarkdown.distHostMod.StringAsyncHost]
  /**
    * Creates a {@link StringAsyncHost} for the provided content.
    * @param content The content of the file.
    * @param file The file name for the content.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  inline def forFile(content: PromiseLike[String]): typingsJapgolly.grammarkdown.distHostMod.StringAsyncHost = ^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.grammarkdown.distHostMod.StringAsyncHost]
  inline def forFile(content: PromiseLike[String], file: String): typingsJapgolly.grammarkdown.distHostMod.StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.grammarkdown.distHostMod.StringAsyncHost]
  inline def forFile(
    content: PromiseLike[String],
    file: String,
    hostFallback: typingsJapgolly.grammarkdown.distHostMod.CoreAsyncHost
  ): typingsJapgolly.grammarkdown.distHostMod.StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.grammarkdown.distHostMod.StringAsyncHost]
  inline def forFile(
    content: PromiseLike[String],
    file: Unit,
    hostFallback: typingsJapgolly.grammarkdown.distHostMod.CoreAsyncHost
  ): typingsJapgolly.grammarkdown.distHostMod.StringAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("forFile")(content.asInstanceOf[js.Any], file.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.grammarkdown.distHostMod.StringAsyncHost]
  
  /**
    * Creates a `CoreAsyncHost`.
    * @param options The options used to configure the host.
    * @param hostFallback An optional host to use as a fallback for operations not supported by this host.
    */
  inline def from(custom: CoreAsyncHostOptions): typingsJapgolly.grammarkdown.distHostMod.CoreAsyncHost = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(custom.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.grammarkdown.distHostMod.CoreAsyncHost]
  inline def from(custom: CoreAsyncHostOptions, hostFallback: typingsJapgolly.grammarkdown.distHostMod.CoreAsyncHost): typingsJapgolly.grammarkdown.distHostMod.CoreAsyncHost = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(custom.asInstanceOf[js.Any], hostFallback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.grammarkdown.distHostMod.CoreAsyncHost]
}
