package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.blobMod.Blob
import typingsJapgolly.nodegit.nodegitInts.`0`
import typingsJapgolly.nodegit.nodegitInts.`16384`
import typingsJapgolly.nodegit.nodegitInts.`33188`
import typingsJapgolly.nodegit.nodegitInts.`33261`
import typingsJapgolly.nodegit.nodegitInts.`40960`
import typingsJapgolly.nodegit.nodegitInts.`57344`
import typingsJapgolly.nodegit.oidMod.Oid
import typingsJapgolly.nodegit.repositoryMod.Repository
import typingsJapgolly.nodegit.treeEntryMod.TreeEntry.FILEMODE
import typingsJapgolly.nodegit.treeMod.Tree
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treeEntryMod {
  
  @JSImport("nodegit/tree-entry", "TreeEntry")
  @js.native
  open class TreeEntry () extends StObject {
    
    def filemode(): FILEMODE = js.native
    
    def filemodeRaw(): FILEMODE = js.native
    
    def free(): Unit = js.native
    
    def getBlob(): js.Promise[Blob] = js.native
    
    def getTree(): js.Promise[Tree] = js.native
    
    def id(): Oid = js.native
    
    def isBlob(): Boolean = js.native
    
    def isDirectory(): Boolean = js.native
    
    def isFile(): Boolean = js.native
    
    def isSubmodule(): Boolean = js.native
    
    def isTree(): Boolean = js.native
    
    def name(): String = js.native
    
    /**
      * Retrieve the SHA for this TreeEntry. Alias for sha
      */
    def oid(): String = js.native
    
    /**
      * Returns the path for this entry.
      */
    def path(): String = js.native
    
    /**
      * Retrieve the SHA for this TreeEntry.
      */
    def sha(): String = js.native
    
    def toObject(repo: Repository): js.Object = js.native
    
    def `type`(): Double = js.native
  }
  object TreeEntry {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.nodegit.nodegitInts.`0`
      - typingsJapgolly.nodegit.nodegitInts.`16384`
      - typingsJapgolly.nodegit.nodegitInts.`33188`
      - typingsJapgolly.nodegit.nodegitInts.`33261`
      - typingsJapgolly.nodegit.nodegitInts.`40960`
      - typingsJapgolly.nodegit.nodegitInts.`57344`
    */
    trait FILEMODE extends StObject
    object FILEMODE {
      
      inline def BLOB: `33188` = 33188.asInstanceOf[`33188`]
      
      inline def COMMIT: `57344` = 57344.asInstanceOf[`57344`]
      
      inline def EXECUTABLE: `33261` = 33261.asInstanceOf[`33261`]
      
      inline def LINK: `40960` = 40960.asInstanceOf[`40960`]
      
      inline def TREE: `16384` = 16384.asInstanceOf[`16384`]
      
      inline def UNREADABLE: `0` = 0.asInstanceOf[`0`]
    }
  }
}
