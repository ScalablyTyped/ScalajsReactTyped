package typingsJapgolly.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HeaderFooterType extends StObject
/**
  * Lists the header/footer types.
  */
@JSGlobal("HeaderFooterType")
@js.native
object HeaderFooterType extends StObject {
  
  /**
    * A header/footer displayed on even pages of the section.
    */
  @js.native
  sealed trait Even
    extends StObject
       with HeaderFooterType
  
  /**
    * A header/footer displayed on the first page of the section.
    */
  @js.native
  sealed trait First
    extends StObject
       with HeaderFooterType
  
  /**
    * A header/footer displayed on odd pages of the section.
    */
  @js.native
  sealed trait Odd
    extends StObject
       with HeaderFooterType
  
  /**
    * A header/footer that is displayed on all pages of the section if the document does not distinguish between first, odd and even pages. Actually, this is an alias for the Odd type.
    */
  @js.native
  sealed trait Primary
    extends StObject
       with HeaderFooterType
}
