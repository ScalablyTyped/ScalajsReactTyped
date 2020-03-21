package typingsJapgolly.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileSystemProvider {
  type DirectoryPathRecursiveRequestedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsJapgolly.chrome.chrome.fileSystemProvider.DirectoryPathRecursiveRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type DirectoryPathRequestedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsJapgolly.chrome.chrome.fileSystemProvider.DirectoryPathRequestedEventOptions, 
      /* successCallback */ js.Function2[
        /* entries */ js.Array[typingsJapgolly.chrome.chrome.fileSystemProvider.EntryMetadata], 
        /* hasMore */ scala.Boolean, 
        scala.Unit
      ], 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type EntryPathRecursiveRequestedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsJapgolly.chrome.chrome.fileSystemProvider.EntryPathRecursiveRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type FilePathLengthRequestedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsJapgolly.chrome.chrome.fileSystemProvider.FilePathLengthRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type FilePathRequestedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsJapgolly.chrome.chrome.fileSystemProvider.FilePathRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type MetadataRequestedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsJapgolly.chrome.chrome.fileSystemProvider.MetadataRequestedEventOptions, 
      /* successCallback */ js.Function1[
        /* metadata */ typingsJapgolly.chrome.chrome.fileSystemProvider.EntryMetadata, 
        scala.Unit
      ], 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type OpenFileRequestedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsJapgolly.chrome.chrome.fileSystemProvider.OpenFileRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type OpenedFileIoRequestedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsJapgolly.chrome.chrome.fileSystemProvider.OpenedFileIoRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type OpenedFileOffsetRequestedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsJapgolly.chrome.chrome.fileSystemProvider.OpenedFileOffsetRequestedEventOptions, 
      /* successCallback */ js.Function2[
        /* data */ scala.scalajs.js.typedarray.ArrayBuffer, 
        /* hasMore */ scala.Boolean, 
        scala.Unit
      ], 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type OpenedFileRequestedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsJapgolly.chrome.chrome.fileSystemProvider.OpenedFileRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type OperationRequestedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsJapgolly.chrome.chrome.fileSystemProvider.OperationRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type OptionlessRequestedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type RequestedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsJapgolly.chrome.chrome.fileSystemProvider.RequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
  type SourceTargetPathRequestedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function3[
      /* options */ typingsJapgolly.chrome.chrome.fileSystemProvider.SourceTargetPathRequestedEventOptions, 
      /* successCallback */ js.Function, 
      /* errorCallback */ js.Function1[/* error */ java.lang.String, scala.Unit], 
      scala.Unit
    ]
  ]
}
