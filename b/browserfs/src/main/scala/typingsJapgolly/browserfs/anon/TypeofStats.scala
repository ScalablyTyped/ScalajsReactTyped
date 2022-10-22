package typingsJapgolly.browserfs.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.Instantiable6
import typingsJapgolly.browserfs.distNodeCoreNodeFsStatsMod.FileType
import typingsJapgolly.browserfs.distNodeCoreNodeFsStatsMod.Stats
import typingsJapgolly.browserfs.distNodeCoreNodeFsStatsMod.default
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofStats
  extends StObject
     with Instantiable2[/* itemType */ FileType, /* size */ Double, default]
     with Instantiable3[/* itemType */ FileType, /* size */ Double, /* mode */ Double, default]
     with Instantiable4[
      /* itemType */ FileType, 
      /* size */ Double, 
      (/* mode */ Double) | (/* mode */ Unit), 
      /* atime */ js.Date, 
      default
    ]
     with Instantiable5[
      /* itemType */ FileType, 
      /* size */ Double, 
      (/* mode */ Double) | (/* mode */ Unit), 
      (/* atime */ js.Date) | (/* atime */ Unit), 
      /* mtime */ js.Date, 
      default
    ]
     with Instantiable6[
      /* itemType */ FileType, 
      /* size */ Double, 
      (/* mode */ Double) | (/* mode */ Unit), 
      (/* atime */ js.Date) | (/* atime */ Unit), 
      (/* mtime */ js.Date) | (/* mtime */ Unit), 
      /* ctime */ js.Date, 
      default
    ] {
  
  def fromBuffer(buffer: Buffer): Stats = js.native
}
