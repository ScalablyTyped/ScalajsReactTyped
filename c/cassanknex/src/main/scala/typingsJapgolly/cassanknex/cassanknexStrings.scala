package typingsJapgolly.cassanknex

import typingsJapgolly.cassanknex.mod.ComparisonRestriction
import typingsJapgolly.cassanknex.mod.InRestriction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cassanknexStrings {
  
  @js.native
  sealed trait Equalssign
    extends StObject
       with ComparisonRestriction
  inline def Equalssign: Equalssign = "=".asInstanceOf[Equalssign]
  
  @js.native
  sealed trait Greaterthansign
    extends StObject
       with ComparisonRestriction
  inline def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignEqualssign
    extends StObject
       with ComparisonRestriction
  inline def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @js.native
  sealed trait IN
    extends StObject
       with InRestriction
  inline def IN: IN = "IN".asInstanceOf[IN]
  
  @js.native
  sealed trait Lessthansign
    extends StObject
       with ComparisonRestriction
  inline def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignEqualssign
    extends StObject
       with ComparisonRestriction
  inline def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @js.native
  sealed trait asc extends StObject
  inline def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait desc extends StObject
  inline def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait in_
    extends StObject
       with InRestriction
  inline def in_ : in_ = "in".asInstanceOf[in_]
}
