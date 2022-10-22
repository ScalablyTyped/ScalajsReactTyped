package typingsJapgolly.lezerLr

import typingsJapgolly.lezerLr.lezerLrInts.`0`
import typingsJapgolly.lezerLr.lezerLrInts.`126`
import typingsJapgolly.lezerLr.lezerLrInts.`131072`
import typingsJapgolly.lezerLr.lezerLrInts.`14`
import typingsJapgolly.lezerLr.lezerLrInts.`19`
import typingsJapgolly.lezerLr.lezerLrInts.`1`
import typingsJapgolly.lezerLr.lezerLrInts.`262144`
import typingsJapgolly.lezerLr.lezerLrInts.`2`
import typingsJapgolly.lezerLr.lezerLrInts.`32`
import typingsJapgolly.lezerLr.lezerLrInts.`34`
import typingsJapgolly.lezerLr.lezerLrInts.`3`
import typingsJapgolly.lezerLr.lezerLrInts.`46`
import typingsJapgolly.lezerLr.lezerLrInts.`4`
import typingsJapgolly.lezerLr.lezerLrInts.`5`
import typingsJapgolly.lezerLr.lezerLrInts.`65535`
import typingsJapgolly.lezerLr.lezerLrInts.`65536`
import typingsJapgolly.lezerLr.lezerLrInts.`6`
import typingsJapgolly.lezerLr.lezerLrInts.`92`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConstantsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.lezerLr.lezerLrInts.`65536`
    - typingsJapgolly.lezerLr.lezerLrInts.`65535`
    - typingsJapgolly.lezerLr.lezerLrInts.`19`
    - typingsJapgolly.lezerLr.lezerLrInts.`131072`
    - typingsJapgolly.lezerLr.lezerLrInts.`262144`
  */
  trait Action extends StObject
  object Action {
    
    inline def GotoFlag: `131072` = 131072.asInstanceOf[`131072`]
    
    inline def ReduceDepthShift: `19` = 19.asInstanceOf[`19`]
    
    inline def ReduceFlag: `65536` = 65536.asInstanceOf[`65536`]
    
    inline def RepeatFlag: `131072` = 131072.asInstanceOf[`131072`]
    
    inline def StayFlag: `262144` = 262144.asInstanceOf[`262144`]
    
    inline def ValueMask: `65535` = 65535.asInstanceOf[`65535`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.lezerLr.lezerLrInts.`126`
    - typingsJapgolly.lezerLr.lezerLrInts.`65535`
    - typingsJapgolly.lezerLr.lezerLrInts.`32`
    - typingsJapgolly.lezerLr.lezerLrInts.`34`
    - typingsJapgolly.lezerLr.lezerLrInts.`92`
    - typingsJapgolly.lezerLr.lezerLrInts.`46`
  */
  trait Encode extends StObject
  object Encode {
    
    inline def Base: `46` = 46.asInstanceOf[`46`]
    
    inline def BigVal: `65535` = 65535.asInstanceOf[`65535`]
    
    inline def BigValCode: `126` = 126.asInstanceOf[`126`]
    
    inline def Gap1: `34` = 34.asInstanceOf[`34`]
    
    inline def Gap2: `92` = 92.asInstanceOf[`92`]
    
    inline def Start: `32` = 32.asInstanceOf[`32`]
  }
  
  object File {
    
    inline def Version: `14` = 14.asInstanceOf[`14`]
  }
  type File = `14`
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.lezerLr.lezerLrInts.`0`
    - typingsJapgolly.lezerLr.lezerLrInts.`1`
    - typingsJapgolly.lezerLr.lezerLrInts.`2`
    - typingsJapgolly.lezerLr.lezerLrInts.`3`
    - typingsJapgolly.lezerLr.lezerLrInts.`4`
    - typingsJapgolly.lezerLr.lezerLrInts.`5`
    - typingsJapgolly.lezerLr.lezerLrInts.`6`
  */
  trait ParseState extends StObject
  object ParseState {
    
    inline def Actions: `1` = 1.asInstanceOf[`1`]
    
    inline def DefaultReduce: `4` = 4.asInstanceOf[`4`]
    
    inline def Flags: `0` = 0.asInstanceOf[`0`]
    
    inline def ForcedReduce: `5` = 5.asInstanceOf[`5`]
    
    inline def Size: `6` = 6.asInstanceOf[`6`]
    
    inline def Skip: `2` = 2.asInstanceOf[`2`]
    
    inline def TokenizerMask: `3` = 3.asInstanceOf[`3`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.lezerLr.lezerLrInts.`65535`
    - typingsJapgolly.lezerLr.lezerLrInts.`0`
    - typingsJapgolly.lezerLr.lezerLrInts.`1`
    - typingsJapgolly.lezerLr.lezerLrInts.`2`
  */
  trait Seq extends StObject
  object Seq {
    
    inline def Done: `0` = 0.asInstanceOf[`0`]
    
    inline def End: `65535` = 65535.asInstanceOf[`65535`]
    
    inline def Next: `1` = 1.asInstanceOf[`1`]
    
    inline def Other: `2` = 2.asInstanceOf[`2`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.lezerLr.lezerLrInts.`0`
    - typingsJapgolly.lezerLr.lezerLrInts.`1`
  */
  trait Specialize extends StObject
  object Specialize {
    
    inline def Extend: `1` = 1.asInstanceOf[`1`]
    
    inline def Specialize: `0` = 0.asInstanceOf[`0`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.lezerLr.lezerLrInts.`1`
    - typingsJapgolly.lezerLr.lezerLrInts.`2`
  */
  trait StateFlag extends StObject
  object StateFlag {
    
    inline def Accepting: `2` = 2.asInstanceOf[`2`]
    
    inline def Skipped: `1` = 1.asInstanceOf[`1`]
  }
  
  object Term {
    
    inline def Err: `0` = 0.asInstanceOf[`0`]
  }
  type Term = `0`
}
