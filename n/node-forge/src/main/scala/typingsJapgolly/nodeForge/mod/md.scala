package typingsJapgolly.nodeForge.mod

import typingsJapgolly.nodeForge.anon.Create
import typingsJapgolly.nodeForge.anon.Sha1
import typingsJapgolly.nodeForge.anon.Sha224
import typingsJapgolly.nodeForge.anon.`0`
import typingsJapgolly.nodeForge.anon.`4`
import typingsJapgolly.nodeForge.mod.md.sha512.Algorithm.Sha384
import typingsJapgolly.nodeForge.mod.md.sha512.Algorithm.Sha512
import typingsJapgolly.nodeForge.mod.md.sha512.Algorithm.Sha512224
import typingsJapgolly.nodeForge.mod.md.sha512.Algorithm.Sha512256
import typingsJapgolly.nodeForge.mod.util.ByteStringBuffer
import typingsJapgolly.nodeForge.nodeForgeInts.`28`
import typingsJapgolly.nodeForge.nodeForgeInts.`32`
import typingsJapgolly.nodeForge.nodeForgeInts.`48`
import typingsJapgolly.nodeForge.nodeForgeInts.`64`
import typingsJapgolly.nodeForge.nodeForgeStrings.`SHA-384`
import typingsJapgolly.nodeForge.nodeForgeStrings.`SHA-512Slash224`
import typingsJapgolly.nodeForge.nodeForgeStrings.`SHA-512Slash256`
import typingsJapgolly.nodeForge.nodeForgeStrings.`SHA-512`
import typingsJapgolly.nodeForge.nodeForgeStrings.sha512Slash224
import typingsJapgolly.nodeForge.nodeForgeStrings.sha512Slash256
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object md {
  
  @JSImport("node-forge", "md")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node-forge", "md.algorithms")
  @js.native
  def algorithms: Sha1 = js.native
  inline def algorithms_=(x: Sha1): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("algorithms")(x.asInstanceOf[js.Any])
  
  object md5 {
    
    @JSImport("node-forge", "md.md5")
    @js.native
    val ^ : `4` = js.native
    
    type Algorithm = typingsJapgolly.nodeForge.nodeForgeStrings.md5
    
    @js.native
    trait MessageDigest
      extends StObject
         with typingsJapgolly.nodeForge.mod.md.MessageDigest
  }
  
  object sha1 {
    
    @JSImport("node-forge", "md.sha1")
    @js.native
    val ^ : Create = js.native
    
    type Algorithm = typingsJapgolly.nodeForge.nodeForgeStrings.sha1
    
    @js.native
    trait MessageDigest
      extends StObject
         with typingsJapgolly.nodeForge.mod.md.MessageDigest
  }
  
  object sha256 {
    
    @JSImport("node-forge", "md.sha256")
    @js.native
    val ^ : `0` = js.native
    
    type Algorithm = typingsJapgolly.nodeForge.nodeForgeStrings.sha256
    
    @js.native
    trait MessageDigest
      extends StObject
         with typingsJapgolly.nodeForge.mod.md.MessageDigest
  }
  
  @JSImport("node-forge", "md.sha384")
  @js.native
  def sha384: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof md.sha384 */ Any = js.native
  inline def sha384_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof md.sha384 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha384")(x.asInstanceOf[js.Any])
  
  object sha512 {
    
    @JSImport("node-forge", "md.sha512")
    @js.native
    val ^ : Sha224 = js.native
    
    object Algorithm {
      
      type Sha384 = typingsJapgolly.nodeForge.nodeForgeStrings.sha384
      
      type Sha512 = typingsJapgolly.nodeForge.nodeForgeStrings.sha512
      
      type Sha512224 = sha512Slash224
      
      type Sha512256 = sha512Slash256
    }
    type Algorithm = Sha384 | Sha512 | Sha512224 | Sha512256
    
    object AlgorithmSelection {
      
      type Sha384 = `SHA-384`
      
      type Sha512 = `SHA-512`
      
      type Sha512224 = `SHA-512Slash224`
      
      type Sha512256 = `SHA-512Slash256`
    }
    type AlgorithmSelection = typingsJapgolly.nodeForge.mod.md.sha512.AlgorithmSelection.Sha384 | typingsJapgolly.nodeForge.mod.md.sha512.AlgorithmSelection.Sha512 | typingsJapgolly.nodeForge.mod.md.sha512.AlgorithmSelection.Sha512224 | typingsJapgolly.nodeForge.mod.md.sha512.AlgorithmSelection.Sha512256
    
    @js.native
    trait MessageDigest
      extends StObject
         with typingsJapgolly.nodeForge.mod.md.MessageDigest
    
    @js.native
    trait Sha384MessageDigest
      extends StObject
         with typingsJapgolly.nodeForge.mod.md.sha512.MessageDigest {
      
      @JSName("algorithm")
      val algorithm_Sha384MessageDigest: Sha384 = js.native
      
      @JSName("digestLength")
      val digestLength_Sha384MessageDigest: `48` = js.native
    }
    
    @js.native
    trait Sha512224MessageDigest
      extends StObject
         with typingsJapgolly.nodeForge.mod.md.sha512.MessageDigest {
      
      @JSName("algorithm")
      val algorithm_Sha512224MessageDigest: Sha512224 = js.native
      
      @JSName("digestLength")
      val digestLength_Sha512224MessageDigest: `28` = js.native
    }
    
    @js.native
    trait Sha512256MessageDigest
      extends StObject
         with typingsJapgolly.nodeForge.mod.md.sha512.MessageDigest {
      
      @JSName("algorithm")
      val algorithm_Sha512256MessageDigest: Sha512256 = js.native
      
      @JSName("digestLength")
      val digestLength_Sha512256MessageDigest: `32` = js.native
    }
    
    @js.native
    trait Sha512MessageDigest
      extends StObject
         with typingsJapgolly.nodeForge.mod.md.sha512.MessageDigest {
      
      @JSName("algorithm")
      val algorithm_Sha512MessageDigest: Sha512 = js.native
      
      @JSName("digestLength")
      val digestLength_Sha512MessageDigest: `64` = js.native
    }
  }
  
  @JSImport("node-forge", "md.sha512/224")
  @js.native
  def sha512224: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof md.sha512.sha224 */ Any = js.native
  
  inline def sha512224_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof md.sha512.sha224 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha512/224")(x.asInstanceOf[js.Any])
  
  @JSImport("node-forge", "md.sha512/256")
  @js.native
  def sha512256: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof md.sha512.sha256 */ Any = js.native
  
  inline def sha512256_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof md.sha512.sha256 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sha512/256")(x.asInstanceOf[js.Any])
  
  type Algorithm = typingsJapgolly.nodeForge.mod.md.md5.Algorithm | typingsJapgolly.nodeForge.mod.md.sha1.Algorithm | typingsJapgolly.nodeForge.mod.md.sha256.Algorithm | typingsJapgolly.nodeForge.mod.md.sha512.Algorithm
  
  @js.native
  trait MessageDigest extends StObject {
    
    val algorithm: Algorithm = js.native
    
    val blockLength: Double = js.native
    
    def digest(): ByteStringBuffer = js.native
    
    val digestLength: Double = js.native
    
    var fullMessageLength: js.Array[Double] | Null = js.native
    
    var messageLength: Double = js.native
    
    val messageLengthSize: Double = js.native
    
    def update(msg: String): this.type = js.native
    def update(msg: String, encoding: Encoding): this.type = js.native
  }
}
