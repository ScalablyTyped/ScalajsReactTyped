package typingsJapgolly.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object bookmarks {
  type BookmarkChangedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* changeInfo */ typingsJapgolly.chrome.chrome.bookmarks.BookmarkChangeInfo, 
      scala.Unit
    ]
  ]
  type BookmarkChildrenReordered = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* reorderInfo */ typingsJapgolly.chrome.chrome.bookmarks.BookmarkReorderInfo, 
      scala.Unit
    ]
  ]
  type BookmarkCreatedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* bookmark */ typingsJapgolly.chrome.chrome.bookmarks.BookmarkTreeNode, 
      scala.Unit
    ]
  ]
  type BookmarkImportBeganEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type BookmarkImportEndedEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type BookmarkMovedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* moveInfo */ typingsJapgolly.chrome.chrome.bookmarks.BookmarkMoveInfo, 
      scala.Unit
    ]
  ]
  type BookmarkRemovedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* removeInfo */ typingsJapgolly.chrome.chrome.bookmarks.BookmarkRemoveInfo, 
      scala.Unit
    ]
  ]
}
