package typingsJapgolly.winrtUwp.global.Windows.Media.Core

import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import typingsJapgolly.winrtUwp.Windows.Media.Core.IMediaSource
import typingsJapgolly.winrtUwp.Windows.Media.Core.MseStreamSource
import typingsJapgolly.winrtUwp.Windows.Media.Streaming.Adaptive.AdaptiveMediaSource
import typingsJapgolly.winrtUwp.Windows.Storage.IStorageFile
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a media source. Provides a common way to reference media from different sources and exposes a common model for accessing media data regardless of the underlying media format. */
/* note: abstract class */ @JSGlobal("Windows.Media.Core.MediaSource")
@js.native
open class MediaSource ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSource
object MediaSource {
  
  @JSGlobal("Windows.Media.Core.MediaSource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an instance of MediaSource from the provided AdaptiveMediaSource .
    * @param mediaSource The AdaptiveMediaSource from which the MediaSource is created.
    * @return The new media source.
    */
  /* static member */
  inline def createFromAdaptiveMediaSource(mediaSource: AdaptiveMediaSource): typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromAdaptiveMediaSource")(mediaSource.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSource]
  
  /**
    * Creates an instance of MediaSource from the provided IMediaSource .
    * @param mediaSource The IMediaSource from which the MediaSource is created.
    * @return The new media source.
    */
  /* static member */
  inline def createFromIMediaSource(mediaSource: IMediaSource): typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromIMediaSource")(mediaSource.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSource]
  
  /**
    * Creates an instance of MediaSource from the provided MediaBinder .
    * @param binder The MediaBinder with which the MediaSource is associated.
    * @return The new media source.
    */
  /* static member */
  inline def createFromMediaBinder(binder: typingsJapgolly.winrtUwp.Windows.Media.Core.MediaBinder): typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromMediaBinder")(binder.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSource]
  
  /**
    * Creates an instance of MediaSource from the provided MediaStreamSource .
    * @param mediaSource The MediaStreamSource from which the MediaSource is created.
    * @return The new media source.
    */
  /* static member */
  inline def createFromMediaStreamSource(mediaSource: typingsJapgolly.winrtUwp.Windows.Media.Core.MediaStreamSource): typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromMediaStreamSource")(mediaSource.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSource]
  
  /**
    * Creates an instance of MediaSource from the provided MseStreamSource .
    * @param mediaSource The MediaStreamSource from which the MediaSource is created.
    * @return The new media source.
    */
  /* static member */
  inline def createFromMseStreamSource(mediaSource: MseStreamSource): typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromMseStreamSource")(mediaSource.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSource]
  
  /**
    * Creates an instance of MediaSource from the provided IStorageFile .
    * @param file The IStorageFile from which the MediaSource is created.
    * @return The new media source.
    */
  /* static member */
  inline def createFromStorageFile(file: IStorageFile): typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromStorageFile")(file.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSource]
  
  /**
    * Creates an instance of MediaSource from the provided IRandomAccessStream .
    * @param stream The stream from which the MediaSource is created.
    * @param contentType The MIME type of the contents of the stream.
    * @return The new media source.
    */
  /* static member */
  inline def createFromStream(stream: IRandomAccessStream, contentType: String): typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSource = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromStream")(stream.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSource]
  
  /**
    * Creates an instance of MediaSource from the provided IRandomAccessStreamReference .
    * @param stream The stream reference from which the MediaSource is created.
    * @param contentType The MIME type of the contents of the stream.
    * @return The new media source.
    */
  /* static member */
  inline def createFromStreamReference(stream: IRandomAccessStreamReference, contentType: String): typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSource = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromStreamReference")(stream.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSource]
  
  /**
    * Creates an instance of MediaSource from the provided Uri .
    * @param uri The URI from which the MediaSource is created.
    * @return The new media source.
    */
  /* static member */
  inline def createFromUri(uri: Uri): typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSource = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromUri")(uri.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.Media.Core.MediaSource]
}
