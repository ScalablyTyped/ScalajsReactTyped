package typingsJapgolly.nodegit

import typingsJapgolly.nodegit.nodegitInts.`0`
import typingsJapgolly.nodegit.nodegitInts.`1`
import typingsJapgolly.nodegit.oidMod.Oid
import typingsJapgolly.nodegit.repositoryMod.Repository
import typingsJapgolly.nodegit.revWalkMod.Revwalk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packBuilderMod {
  
  @JSImport("nodegit/pack-builder", "Packbuilder")
  @js.native
  open class Packbuilder () extends StObject {
    
    def free(): Unit = js.native
    
    def hash(): Oid = js.native
    
    def insert(id: Oid, name: String): Double = js.native
    
    def insertCommit(id: Oid): Double = js.native
    
    def insertRecur(id: Oid, name: String): Double = js.native
    
    def insertTree(id: Oid): Double = js.native
    
    def insertWalk(walk: Revwalk): Double = js.native
    
    def objectCount(): Double = js.native
    
    def setThreads(n: Double): Double = js.native
    
    def written(): Double = js.native
  }
  /* static members */
  object Packbuilder {
    
    @JSImport("nodegit/pack-builder", "Packbuilder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(repo: Repository): Packbuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(repo.asInstanceOf[js.Any]).asInstanceOf[Packbuilder]
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.nodegit.nodegitInts.`0`
      - typingsJapgolly.nodegit.nodegitInts.`1`
    */
    trait STAGE extends StObject
    object STAGE {
      
      inline def ADDING_OBJECTS: `0` = 0.asInstanceOf[`0`]
      
      inline def DELTAFICATION: `1` = 1.asInstanceOf[`1`]
    }
  }
}
