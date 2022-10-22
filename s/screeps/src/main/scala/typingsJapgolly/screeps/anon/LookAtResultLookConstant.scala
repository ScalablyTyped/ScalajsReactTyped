package typingsJapgolly.screeps.anon

import typingsJapgolly.screeps.BuildableStructureConstant
import typingsJapgolly.screeps.ConstructionSite
import typingsJapgolly.screeps.Creep
import typingsJapgolly.screeps.Deposit
import typingsJapgolly.screeps.Flag
import typingsJapgolly.screeps.LookConstant
import typingsJapgolly.screeps.Mineral
import typingsJapgolly.screeps.MineralConstant
import typingsJapgolly.screeps.Nuke
import typingsJapgolly.screeps.PowerCreep
import typingsJapgolly.screeps.RESOURCE_ENERGY
import typingsJapgolly.screeps.Resource
import typingsJapgolly.screeps.ResourceConstant
import typingsJapgolly.screeps.Ruin
import typingsJapgolly.screeps.Source
import typingsJapgolly.screeps.Structure
import typingsJapgolly.screeps.StructureConstant
import typingsJapgolly.screeps.Terrain
import typingsJapgolly.screeps.Tombstone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined screeps.LookAtResult<screeps.LookConstant> */
trait LookAtResultLookConstant extends StObject {
  
  var constructionSite: js.UndefOr[ConstructionSite[BuildableStructureConstant]] = js.undefined
  
  var creep: js.UndefOr[Creep] = js.undefined
  
  var deposit: js.UndefOr[Deposit] = js.undefined
  
  var energy: js.UndefOr[Resource[RESOURCE_ENERGY]] = js.undefined
  
  var flag: js.UndefOr[Flag] = js.undefined
  
  var mineral: js.UndefOr[Mineral[MineralConstant]] = js.undefined
  
  var nuke: js.UndefOr[Nuke] = js.undefined
  
  var powerCreep: js.UndefOr[PowerCreep] = js.undefined
  
  var resource: js.UndefOr[Resource[ResourceConstant]] = js.undefined
  
  var ruin: js.UndefOr[Ruin] = js.undefined
  
  var source: js.UndefOr[Source] = js.undefined
  
  var structure: js.UndefOr[Structure[StructureConstant]] = js.undefined
  
  var terrain: js.UndefOr[Terrain] = js.undefined
  
  var tombstone: js.UndefOr[Tombstone] = js.undefined
  
  var `type`: LookConstant
}
object LookAtResultLookConstant {
  
  inline def apply(`type`: LookConstant): LookAtResultLookConstant = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookAtResultLookConstant]
  }
  
  extension [Self <: LookAtResultLookConstant](x: Self) {
    
    inline def setConstructionSite(value: ConstructionSite[BuildableStructureConstant]): Self = StObject.set(x, "constructionSite", value.asInstanceOf[js.Any])
    
    inline def setConstructionSiteUndefined: Self = StObject.set(x, "constructionSite", js.undefined)
    
    inline def setCreep(value: Creep): Self = StObject.set(x, "creep", value.asInstanceOf[js.Any])
    
    inline def setCreepUndefined: Self = StObject.set(x, "creep", js.undefined)
    
    inline def setDeposit(value: Deposit): Self = StObject.set(x, "deposit", value.asInstanceOf[js.Any])
    
    inline def setDepositUndefined: Self = StObject.set(x, "deposit", js.undefined)
    
    inline def setEnergy(value: Resource[RESOURCE_ENERGY]): Self = StObject.set(x, "energy", value.asInstanceOf[js.Any])
    
    inline def setEnergyUndefined: Self = StObject.set(x, "energy", js.undefined)
    
    inline def setFlag(value: Flag): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
    
    inline def setMineral(value: Mineral[MineralConstant]): Self = StObject.set(x, "mineral", value.asInstanceOf[js.Any])
    
    inline def setMineralUndefined: Self = StObject.set(x, "mineral", js.undefined)
    
    inline def setNuke(value: Nuke): Self = StObject.set(x, "nuke", value.asInstanceOf[js.Any])
    
    inline def setNukeUndefined: Self = StObject.set(x, "nuke", js.undefined)
    
    inline def setPowerCreep(value: PowerCreep): Self = StObject.set(x, "powerCreep", value.asInstanceOf[js.Any])
    
    inline def setPowerCreepUndefined: Self = StObject.set(x, "powerCreep", js.undefined)
    
    inline def setResource(value: Resource[ResourceConstant]): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setRuin(value: Ruin): Self = StObject.set(x, "ruin", value.asInstanceOf[js.Any])
    
    inline def setRuinUndefined: Self = StObject.set(x, "ruin", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setStructure(value: Structure[StructureConstant]): Self = StObject.set(x, "structure", value.asInstanceOf[js.Any])
    
    inline def setStructureUndefined: Self = StObject.set(x, "structure", js.undefined)
    
    inline def setTerrain(value: Terrain): Self = StObject.set(x, "terrain", value.asInstanceOf[js.Any])
    
    inline def setTerrainUndefined: Self = StObject.set(x, "terrain", js.undefined)
    
    inline def setTombstone(value: Tombstone): Self = StObject.set(x, "tombstone", value.asInstanceOf[js.Any])
    
    inline def setTombstoneUndefined: Self = StObject.set(x, "tombstone", js.undefined)
    
    inline def setType(value: LookConstant): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
