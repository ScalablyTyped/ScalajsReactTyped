package typingsJapgolly.semver

import typingsJapgolly.semver.mod.Options
import typingsJapgolly.semver.semverStrings.Equalssign
import typingsJapgolly.semver.semverStrings.Greaterthansign
import typingsJapgolly.semver.semverStrings.GreaterthansignEqualssign
import typingsJapgolly.semver.semverStrings.Lessthansign
import typingsJapgolly.semver.semverStrings.LessthansignEqualssign
import typingsJapgolly.semver.semverStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classesComparatorMod {
  
  @JSImport("semver/classes/comparator", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Comparator {
    def this(comp: String) = this()
    def this(comp: Comparator) = this()
    def this(comp: String, optionsOrLoose: Boolean) = this()
    def this(comp: String, optionsOrLoose: Options) = this()
    def this(comp: Comparator, optionsOrLoose: Boolean) = this()
    def this(comp: Comparator, optionsOrLoose: Options) = this()
  }
  
  @js.native
  trait Comparator extends StObject {
    
    def intersects(comp: Comparator): Boolean = js.native
    def intersects(comp: Comparator, optionsOrLoose: Boolean): Boolean = js.native
    def intersects(comp: Comparator, optionsOrLoose: Options): Boolean = js.native
    
    var loose: Boolean = js.native
    
    var operator: _empty | Equalssign | Lessthansign | Greaterthansign | LessthansignEqualssign | GreaterthansignEqualssign = js.native
    
    var options: Options = js.native
    
    def parse(comp: String): Unit = js.native
    
    var semver: typingsJapgolly.semver.classesSemverMod.^ = js.native
    
    def test(version: String): Boolean = js.native
    def test(version: typingsJapgolly.semver.classesSemverMod.^): Boolean = js.native
    
    var value: String = js.native
  }
}
